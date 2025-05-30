package com.interview.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void shouldReturnFizzForNumberDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void shouldReturnBuzzForNumberDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void shouldReturnFizzBuzzForNumberDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void shouldReturnNumberAsStringWhenNotDivisibleByThreeOrFive() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void shouldReturnFizzForNegativeMultipleOfThree() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(-3));
    }

    @Test
    void shouldReturnBuzzForNegativeMultipleOfFive() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(-5));
    }

    @Test
    void shouldReturnFizzBuzzForNegativeMultipleOfThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(-15));
    }

    @Test
    void shouldReturnNumberAsStringForNegativeNonDivisible() {
        assertEquals("-1", FizzBuzz.fizzBuzz(-1));
    }

    @Test
    void shouldReturnFizzBuzzForZero() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(0));
    }

    @Test
    void shouldReturnFizzBuzzForNegativeZero() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(-0));
    }
    
    @Test
    void shouldReturnFizzBuzzForLargeNumber() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(1500)); // divisible by 3 and 5
    }
} 