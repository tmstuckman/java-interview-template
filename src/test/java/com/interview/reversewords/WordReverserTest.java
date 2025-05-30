package com.interview.reversewords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordReverserTest {
    
    @Test
    void normalSentence() {
        assertEquals("blue is sky the", WordReverser.reverseWords("the sky is blue"));
    }
    
    @Test
    void singleWord() {
        assertEquals("hello", WordReverser.reverseWords("hello"));
    }
    
    @Test
    void emptyString() {
        assertEquals("", WordReverser.reverseWords(""));
    }
    
    @Test
    void twoWords() {
        assertEquals("world hello", WordReverser.reverseWords("hello world"));
    }
    
    @Test
    void multipleWords() {
        assertEquals("fun is java", WordReverser.reverseWords("java is fun"));
    }
    
    @Test
    void leadingSpaces() {
        assertEquals("world hello", WordReverser.reverseWords("  hello world"));
    }
    
    @Test
    void trailingSpaces() {
        assertEquals("world hello", WordReverser.reverseWords("hello world  "));
    }
    
    @Test
    void multipleSpaces() {
        assertEquals("world hello", WordReverser.reverseWords("hello   world"));
    }
    
    @Test
    void paragraph() {
        String input = "The quick brown fox jumps over the lazy dog";
        String expected = "dog lazy the over jumps fox brown quick The";
        assertEquals(expected, WordReverser.reverseWords(input));
    }
} 