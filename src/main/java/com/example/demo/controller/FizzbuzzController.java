package com.example.demo.controller;

import com.example.demo.model.Fizzbuzz;
import com.example.demo.service.FizzbuzzService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "fizzbuzz")
public class FizzbuzzController {
    private final FizzbuzzService fizzbuzzService;

    @Autowired
    public FizzbuzzController(FizzbuzzService fizzbuzzService) {
        this.fizzbuzzService = fizzbuzzService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary= "Fizzbuzz", description= "A list from 0 to 30. If the value is divisible by 3, show\n" +
            "“fizz”, is it dividable by 5, show “buzz”. Otherwise, show the number.")
    public List<Fizzbuzz> getFizzbuzz() {
        return fizzbuzzService.getFizzbuzz();
    }
}
