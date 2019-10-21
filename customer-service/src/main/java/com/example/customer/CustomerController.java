package com.example.customer;

import io.opentracing.Tracer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final Tracer tracer;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {

        return customerRepository.findAll();
    }

}
