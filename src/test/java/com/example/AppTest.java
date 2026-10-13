package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testEvenNumber() {
        App obj = new App();
        assertEquals("Even", obj.checkEvenOdd(4));
    }

    @Test
    public void testOddNumber() {
        App obj = new App();
        assertEquals("Odd", obj.checkEvenOdd(7));
    }
}