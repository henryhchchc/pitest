package com.example.history;

public class ClassA {
    public int returnOne() {
        System.out.println("I was run");
        return 1;
    }

    public int noCoverage() {
        System.out.println("");
        return 1;
    }
}
