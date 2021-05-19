package com.example.springdatarest.dao;

import com.example.springdatarest.ds.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
