package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTests {
    private SumCalculator sumCalc;

    @BeforeEach
    public void beforeEach() {
        sumCalc = new SumCalculator();
    }

    @Test
    public void sumTest1() {
        //When
        int actual = sumCalc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumTest2() {
        //When
        int actual = sumCalc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumTest3() {
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        Assertions.assertThrows(expected, () -> sumCalc.sum(0));
    }
}
