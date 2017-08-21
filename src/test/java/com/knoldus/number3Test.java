package com.knoldus;

import org.junit.Test;

import static org.junit.Assert.*;

public class number3Test {
    @Test
    public void increment() throws Exception {
        number3 object = x->{};
        assertEquals(14,object.increment(5));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(35,number1.multiply(5,7));
    }
}