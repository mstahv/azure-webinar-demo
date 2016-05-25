package com.example;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import org.vaadin.viritin.fields.MTextField;
import org.vaadin.viritin.form.AbstractForm;
import org.vaadin.viritin.layouts.MVerticalLayout;

public class CustomerViritinForm extends AbstractForm<Customer> {
    
        TextField title = new MTextField("title");

        TextField firstName = new MTextField("firstName");

        TextField middleName = new MTextField("middleName");

        TextField lastName = new MTextField("lastName");

        TextField suffix = new MTextField("suffix");
        TextField companyName = new MTextField("companyName");
        TextField emailAddress = new MTextField("emailAddress");

        TextField phone = new MTextField("phone");

        DateField modifiedDate = new DateField("modifiedDate");

    @Override
    protected Component createContent() {
        return new MVerticalLayout(
                new FormLayout(
                     title ,
                     firstName ,
                     middleName ,
                     lastName ,
                     suffix ,
                     companyName ,
                     emailAddress ,
                     phone ,
                     modifiedDate 
                ),
                getToolbar()
        );
    }
    
}