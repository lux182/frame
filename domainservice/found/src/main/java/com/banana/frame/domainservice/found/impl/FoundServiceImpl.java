package com.banana.frame.domainservice.found.impl;

import com.banana.frame.domain.found.found.Customer;
import com.banana.frame.domainservice.found.FoundService;
import com.banana.frame.domainservice.found.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/**
 * <p></p>
 *
 * @author Louis
 * @version $Id:com.banana.frame.domainservice.found.impl, v 0.1 2016/7/26 17:24 liuxuesi Exp $
 */
public class FoundServiceImpl implements FoundService {
    private static final Logger log = LoggerFactory.getLogger(FoundServiceImpl.class);

    @Autowired
    private CustomerRepository repository;

    @Override
    public String query() {

        return repository.findOne(1L).toString();
    }
    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findOne(1L);
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Customer bauer : repository.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }
}
