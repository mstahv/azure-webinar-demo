package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.viritin.fields.MTable;
import org.vaadin.viritin.layouts.MVerticalLayout;

/**
 * Created by mattitahvonenitmill on 24/05/16.
 */
@SpringUI
@Theme("valo")
public class VaadinUI extends UI {

    @Autowired
    CustomerRepository repo;
    private MTable<Customer> g;

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        g = new MTable<>(Customer.class);

        g.withProperties("firstName", "lastName", "emailAddress");

        listEntities();

        g.setHeight("300px");

        CustomerViritinForm form = new CustomerViritinForm();
        form.setVisible(false);

        g.addMValueChangeListener(e -> {
            Customer customer = e.getValue();
            form.setEntity(customer);

        });

        form.setSavedHandler(customer -> {
            repo.save(customer);
            listEntities();
        });
        
        
        TextField filtering = new TextField();
        filtering.setInputPrompt("Filter by last name...");
        filtering.addTextChangeListener(e-> {
            String filterString = e.getText();
            List<Customer> filteredList = repo.findByLastNameLikeIgnoreCase(filterString + "%");
            g.setBeans(filteredList);
        });
        

        setContent(new MVerticalLayout(new Label("Hello Azure!"), filtering, g, form));

    }
    
    protected void listEntities() {
        g.setBeans(repo.findAll());
    }
}
