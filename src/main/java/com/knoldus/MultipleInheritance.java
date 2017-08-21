package com.knoldus;

interface number1 {

    default int increment(int y) {
        return y + 1;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    void display(int x);
}

interface number2 {
    default int increment(int y) {
        return y + 2;
    }
}

interface number3 extends number1, number2 {
    @Override
    default int increment(int y) {
        return number1.super.increment(y) + number2.super.increment(y) + 1;
    }
}


