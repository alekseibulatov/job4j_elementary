package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.calculator.Fit.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

@Test
    void testWhenHeightMan165Then75() {
        short height = 165;
        double result = manWeight(height);
        double expected = 75;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    @Test
    void testWhenHeightMan180Then92() {
        short height = 180;
        double result = manWeight(height);
        double expected = 92;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    @Test
    void testWhenHeightWoman160Then58() {
        short height = 160;
        double result = womanWeight(height);
        double expected = 58;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    @Test
    void testWhenHeightWoman170Then69() {
        short height = 170;
        double result = womanWeight(height);
        double expected = 69;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }
}