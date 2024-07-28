package com.example.lambda;

@FunctionalInterface
public interface Demo4Inter {
    void m1(Integer number);

    default void m2() {
    }

    public static void m3() {
    }
}
