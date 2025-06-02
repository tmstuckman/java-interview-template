package com.interview.reversewords;

public class WordReverser {
    /**
     * Reverses the order of words in a sentence.
     * Words are separated by spaces, and the characters within each word
     * remain in their original order.
     *
     * @param sentence The input sentence to reverse
     * @return A new string with the words in reverse order
     */
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }
        
        // Split the sentence into words, handling multiple spaces
        String[] words = sentence.trim().split("\\s+");
        
        // Reverse the array of words
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        
        // Join the words back together with a single space
        return String.join(" ", words);
    }
} 