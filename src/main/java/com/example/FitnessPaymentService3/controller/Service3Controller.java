package com.example.FitnessPaymentService3.controller;

import com.example.FitnessPaymentService3.model.Service3Request;
import com.example.FitnessPaymentService3.model.Service3Response;
import com.example.FitnessPaymentService3.service.Service3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service3")
public class Service3Controller {
    @Autowired
    private Service3 service3;

    @PostMapping("/process-payment")
    public ResponseEntity<Service3Response> processPayment(@RequestBody Service3Request request) {
        Service3Response response = service3.processPayment(request.getCardNumber(),request.getAmount());
        return ResponseEntity.ok(response);
    }
}
