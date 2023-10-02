package com.example.FitnessPaymentService3.service;

import com.example.FitnessPaymentService3.model.Service3Response;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;

@Service
public class Service3 {
    public Service3Response processPayment(String cardNumber, BigDecimal amount) {
        simulateBusinessProcess();
        String timestamp = Instant.now().toString();
        return new Service3Response("SUCCESS", timestamp);
    }

    private void simulateBusinessProcess() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
