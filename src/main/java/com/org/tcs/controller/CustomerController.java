package com.org.tcs.controller;

import com.org.tcs.model.Customer;
import com.org.tcs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer)  ;
    }
    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }
    @GetMapping("/getAll")
    public List<Customer> getAll(){
        customerService.getAll();
        return null;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
        return null;
    }
}
