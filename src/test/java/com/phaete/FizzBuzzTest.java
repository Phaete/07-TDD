package com.phaete;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void play_shouldReturn1_whenCalledWith1() {
        assertEquals("1", FizzBuzz.play(1));
    }

    @Test
    void play_shouldReturn4_whenCalledWith4() {
        assertEquals("4", FizzBuzz.play(4));
    }

    @Test
    void play_shouldReturnFizz_whenCalledWith3() {
        assertEquals("Fizz", FizzBuzz.play(3));
    }

    @Test
    void play_shouldReturnBuzz_whenCalledWith5() {
        assertEquals("Buzz", FizzBuzz.play(5));
    }

    @Test
    void play_shouldReturnFizzBuzz_whenCalledWith15() {
        assertEquals("FizzBuzz", FizzBuzz.play(15));
    }
}