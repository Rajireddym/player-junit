package com.org.tcs.service;

import com.org.tcs.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
    public void createCustomer( Customer customer);
    public void updateCustomer( Customer customer);
    public List<Customer> getAll();
    public String deleteById( Integer id);
}
