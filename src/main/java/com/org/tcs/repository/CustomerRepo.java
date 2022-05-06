package com.org.tcs.repository;

import com.org.tcs.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
