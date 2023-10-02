package com.example.FitnessPaymentService3.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Service3Request {
    private String cardNumber;
    private BigDecimal amount;
}
