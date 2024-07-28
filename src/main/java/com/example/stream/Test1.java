package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    static List<Integer> numbers = Arrays.asList(1, 46, 67987, 3, 987, 9435, 676, 8, 43, 5, 16);

    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
//        Double result = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .peek(System.out::println)
//                .map(n -> Math.sqrt(n))
//                .peek(System.out::println)
//                .mapToDouble(d -> d)
//                .average().getAsDouble();
        Double result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .peek(number -> System.out.println("Số chẵn: " + number))
                .map(n -> Math.sqrt(n))
                .peek(sqrt -> System.out.println("Căn bậc 2: " + sqrt))
                .mapToDouble(d -> d)
                .average()
                .getAsDouble();
        System.out.println("> Result : " + result);
    }
}
