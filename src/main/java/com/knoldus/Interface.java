package com.knoldus;

interface Calculator {

    default int increment(int y) {
        return y + 1;
    }

    static int multiply(int x, int y) { return x*y;}

    int display(int x);

}

class CalculatorImplements implements Calculator {

    @Override
    public int display(int x) {
        return x;
    }

    @Override
    public int increment(int x) {
        return Calculator.super.increment(x) + 2;
    }
}

