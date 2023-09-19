package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fizzbuzz {
    @JsonProperty("input")
    private Integer input;
    @JsonProperty("output")
    private String output;

    public Fizzbuzz(Integer input, String output) {
        this.input = input;
        this.output = output;
    }
}
