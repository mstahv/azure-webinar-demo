package com.example;

import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mattitahvonenitmill on 24/05/16.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public List<Customer> findByLastNameLikeIgnoreCase(String string);

}
