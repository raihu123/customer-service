package com.miu.swa.project.customerservice.repo;

import com.miu.swa.project.customerservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface CustomerRepo extends MongoRepository<Customer, BigInteger> {
    Optional<Customer> findByCustomerID(BigInteger customerID);
}
