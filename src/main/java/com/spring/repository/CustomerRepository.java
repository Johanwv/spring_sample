package com.spring.repository;

import com.spring.model.Customer;

import java.util.List;

public interface CustomerRepository
{
    List<Customer> findAll();
}
