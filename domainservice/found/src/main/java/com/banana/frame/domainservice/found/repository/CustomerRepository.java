package com.banana.frame.domainservice.found.repository;
import java.util.List;

import com.banana.frame.domain.found.found.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
