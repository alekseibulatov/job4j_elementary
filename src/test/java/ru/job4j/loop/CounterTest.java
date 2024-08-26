package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.loop.Counter.sum;

class CounterTest {

    @Test
    void testSum0To5Is15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void testSum10To0Is0() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        int output = sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void testSum3To8Is0() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void testSum1To1Is1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}