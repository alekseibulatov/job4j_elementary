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
        short input = 165;
        double expected = 74.75;
        double output = manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void testWhenHeightMan180Then92() {
        short input = 175;
        double expected = 86.25;
        double output = manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void testWhenHeightWoman160Then58() {
        short input = 160;
        double expected = 57.5;
        double output = womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void testWhenHeightWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}