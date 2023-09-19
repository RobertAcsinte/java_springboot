package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ValuesService {
    public String[] Values()
    {
        return new String[] {
                "42",
                "1e3",
                "1.222",
                null,
                "-12"
        };
    }
    public String getValues() {
        ArrayList<String> valuesList = new ArrayList<>(Arrays.asList(Values())); // Convert the array to an ArrayList
        int sum = 0;
        for (String value : valuesList) {
            if(value != null) {
                value = value.replace(".", "");
                sum += new BigDecimal(value).intValue();
            }
        }
        return String.valueOf(sum);
    }
}
