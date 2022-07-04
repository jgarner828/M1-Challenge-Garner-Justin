package com.calculatorobject;

public class Calculator {


    public int add(int a, int b) {
        System.out.println(a + " plus " + b + " equals " + (a + b));
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println(a + " minus " + b + " equals " + (a - b));
        return a - b;
    }

    public double subtract(double a, double b) {
        System.out.println(a + " minus " + b + " equals " + (a - b));
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println(a + " times " + b + " equals " + (a * b));
        return a * b;
    }

    public double multiply(double a, double b) {
        System.out.println(a + " times " + b + " equals " + (a * b));
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println(a + " divided by " + b + " equals " + (a * b));
        return a / b;
    }

    public double divide(double a, double b) {
        System.out.println(a + " divided by " + b + " equals " + (a * b));
        return a / b;
    }

}


