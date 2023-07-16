package org.example.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalc;

    @BeforeEach
    public void beforeEach() {
        sumCalc = new SumCalculator();
    }

    @Test
    public void testSumCalc1() {
        Assertions.assertEquals(1, sumCalc.sum(1));
    }

    @Test
    public void testSumCalc3() {
        Assertions.assertEquals(6, sumCalc.sum(3));
    }

    @Test
    public void testSumCalc0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalc.sum(0);
        });
    }


}
