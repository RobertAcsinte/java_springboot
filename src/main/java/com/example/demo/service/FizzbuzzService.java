package com.example.demo.service;

import com.example.demo.model.Fizzbuzz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzbuzzService {
    public List<Fizzbuzz> getFizzbuzz() {
        List<Fizzbuzz> fizzbuzzList = new ArrayList<>();
        for(int input = 0; input <= 30; input++) {
            String output = String.valueOf(input);
            if(input % 3 == 0) {
                output = "Fizz";
            }
            if(input % 5 == 0) {
                if(input % 3 == 0) {
                    output += "Buzz";
                } else {
                    output = "Buzz";
                }
            }
            fizzbuzzList.add(new Fizzbuzz(input, output));
        }
        return fizzbuzzList;
    }
}
