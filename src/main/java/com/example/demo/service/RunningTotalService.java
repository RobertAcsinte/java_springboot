package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RunningTotalService {
    ArrayList<Integer> numbList = new ArrayList<>();

    public String getSum(String number) {
        int sum = 0;
        try {
            if (numbList.size() == 3) {
                numbList.set(0, numbList.get(1));
                numbList.set(1, numbList.get(2));
                numbList.set(2, Integer.parseInt(number));
            } else {
                numbList.add(Integer.parseInt(number));
            }
            for (Integer n : numbList) {
                sum += n;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format: " + number);
        }
        return Integer.toString(sum);
    }
}