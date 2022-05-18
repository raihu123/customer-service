package com.miu.swa.project.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private BigInteger customerID;
    private String fName;
    private String lName;
    private String phone;
    private String email;
    private ShoppingCart shoppingCart;
    private Address address;
}
