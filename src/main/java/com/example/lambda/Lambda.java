package com.example.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        List<Integer> numbers = Arrays.asList(1, 3, 77, 22, 88, 34, 232, 789);
        numbers.forEach(number -> System.out.println(number));
    }
}
