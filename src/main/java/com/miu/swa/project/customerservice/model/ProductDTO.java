package com.miu.swa.project.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    BigInteger prodID;
    String name;
    Double price;
    String description;
    BigInteger stock;
    int quantity;
}
