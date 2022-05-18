package com.miu.swa.project.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
public class ShoppingCart {
    BigInteger shoppingCartID;
    HashMap<BigInteger, ProductDTO> shoppingCartList;
}
