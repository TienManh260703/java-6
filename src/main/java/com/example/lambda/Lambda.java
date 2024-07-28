package com.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
    static List<Student> students = Arrays.asList(
            new Student("Mạnh 1", true, 3.5),
            new Student("Mạnh 2", false, 4.6),
            new Student("Mạnh 3", false, 7.6),
            new Student("Mạnh 4", false, 9.5),
            new Student("Mạnh 5", false, 5.5),
            new Student("Mạnh 6", true, 6.6),
            new Student("Mạnh 7", false, 7.25),
            new Student("Mạnh 8", true, 8.75)
    );

    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
        demo4();
    }

    private static void demo1() {
        List<Integer> numbers = Arrays.asList(1, 3, 77, 22, 88, 34, 232, 789);
        numbers.forEach(number -> System.out.println(number));
    }

    private static void demo2() {
        students.forEach(student -> {
                    System.out.println(">> Name : " + student.getName());
                    System.out.println(">> Marks : " + student.getMarks());
                    System.out.println();
                }
        );
    }

    //sort
    private static void demo3() {
        Collections.sort(students, (student1, student2) -> -student1.getMarks().compareTo(student2.getMarks()));
        demo2();
    }

    private static void demo4() {
        // thông thường
        Demo4Inter o = new Demo4Inter() {
            @Override
            public void m1(Integer number) {
                System.out.println(number);
            }
        };
        o.m1(1000);
        // lambda
        Demo4Inter o2 = number -> System.out.println(number);
        o2.m1(2000);
    }


}
