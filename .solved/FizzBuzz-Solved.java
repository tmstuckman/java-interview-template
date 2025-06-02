package com.interview.fizzbuzz;

public class FizzBuzz {
    /**
     * Challenge 1: Implement FizzBuzz logic
     * 
     * For numbers divisible by 3, return "Fizz"
     * For numbers divisible by 5, return "Buzz"
     * For numbers divisible by both 3 and 5, return "FizzBuzz"
     * For all other numbers, return the number as a string
     */
    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
} 