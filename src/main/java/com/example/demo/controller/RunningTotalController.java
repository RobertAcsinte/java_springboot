package com.example.demo.controller;

import com.example.demo.service.RunningTotalService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "runningtotal")
public class RunningTotalController {
    private final RunningTotalService runningTotalService;

    @Autowired
    public RunningTotalController(RunningTotalService runningTotalService) {
        this.runningTotalService = runningTotalService;
    }

    @PutMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    @Operation(summary = "Get the sum of the last 3 submitted number", description = "The body should only consist of the number.")
    public String getSum(
            @RequestParam String number
    ) {
        return runningTotalService.getSum(number);
    }

}
