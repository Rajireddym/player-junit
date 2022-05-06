package com.org.tcs.service;

import com.org.tcs.model.Customer;
import com.org.tcs.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer)
    {
        customerRepo.save(customer) ;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> rrr = customerRepo.findAll();
        return rrr;
    }

    @Override
    public String deleteById(Integer id) {
        customerRepo.deleteById(id);
        return "success";
    }
}
