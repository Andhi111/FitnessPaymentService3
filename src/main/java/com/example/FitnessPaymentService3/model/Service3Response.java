package com.example.FitnessPaymentService3.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
public class Service3Response {
    private String status;
    private String timestamp;

    public Service3Response() {
        // Default constructor
    }
    public Service3Response(String status, String timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }
}
