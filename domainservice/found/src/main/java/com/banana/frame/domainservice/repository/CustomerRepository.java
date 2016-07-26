package com.banana.frame.domainservice.repository;
import java.util.List;

import com.banana.frame.domain.found.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
