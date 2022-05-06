package com.org.tcs.service;

import com.org.tcs.model.Customer;
import com.org.tcs.repository.CustomerRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.parser.DTDConstants.ID;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class CustomerServiceImplTest {
    @InjectMocks
    CustomerServiceImpl customerServiceImpl;
    @Mock
    CustomerRepo customerRepo;

    @Test
    void createCustomer() {
        Customer customer=new Customer();
        customer.setId(18);
        customer.setName("virat");
        customer.setAddress("blr");
        Mockito.when(customerRepo.save(customer)).thenReturn(customer);
        customerServiceImpl.createCustomer(customer);




    }

    @Test
    void updateCustomer() {
        Customer customer=new Customer();
        customer.setId(18);
        customer.setName("abd");
        customer.setAddress("sa");
        Mockito.when(customerRepo.save(customer)).thenReturn(customer);

        customerServiceImpl.updateCustomer(customer);
    }

    @Test
    void getAll() {
        List<Customer> list = new ArrayList<>();
        Customer customer=new Customer();
        customer.setId(45);
        customer.setName("bhuvi");
        customer.setAddress("hyd");
        list.add(customer);

        Customer customer1=new Customer();
        customer1.setId(99);
        customer1.setName("bhuvi");
        customer1.setAddress("hyd");
        list.add(customer1);
        Mockito.when(customerRepo.findAll()).thenReturn(list);
        List<Customer> list2 =customerServiceImpl.getAll();
        Assertions.assertEquals(list,list2);
    }





}