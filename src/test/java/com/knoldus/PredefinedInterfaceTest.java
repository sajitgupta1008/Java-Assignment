package com.knoldus;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredefinedInterfaceTest {
    @Test
    public void predicateTest() {
    assertTrue(new PredefinedInterface().predicateTest(54));
    }

}