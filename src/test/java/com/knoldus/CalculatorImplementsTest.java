package com.knoldus;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplementsTest {

    private Calculator calculator = new CalculatorImplements();
    @Test
    public void display() throws Exception {
        assertEquals(5,calculator.display(5));
    }

    @Test
    public void increment() throws Exception {
    assertEquals(8,calculator.increment(5));
    }

}