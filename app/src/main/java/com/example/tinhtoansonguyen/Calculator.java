package com.example.tinhtoansonguyen;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return (float) a / b;
    }
}

