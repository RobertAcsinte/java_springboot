package com.example.demo.controller;

import com.example.demo.service.ValuesService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "values")
public class ValuesController {
    private final ValuesService valuesService;

    @Autowired
    public ValuesController(ValuesService valuesService) {
        this.valuesService = valuesService;
    }

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    @Operation(summary = "Get the sum of values", description = "Get the sum of the values 42, 1e3, 1.222, null and -12.")
    public String getValues() {
        return valuesService.getValues();
    }

}
