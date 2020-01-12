package com.pgrela.sda.bdd.basics;

public class Calculator {
    int lastResult;
    int add(int a, int b) {
        return lastResult = a + b;
    }

    public int lastResult() {
        return lastResult;
    }

    public int sub(int a, int b) {
        return lastResult = a - b;
    }
}
