package com.interview.lrucache;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Challenge: Implement comprehensive unit tests for the LRU Cache
 * 
 * What is an LRU Cache?
 * An LRU (Least Recently Used) Cache is a fixed-size data structure that:
 * - Stores key-value pairs up to a maximum capacity
 * - Removes the least recently used item when full
 * - Moves items to the front when accessed or updated
 * 
 * Your task is to write thorough unit tests that verify:
 * 1. Basic operations (put/get) work correctly
 * 2. Cache capacity is enforced
 * 3. Least recently used items are evicted when full
 * 4. Accessing an item makes it most recently used
 * 5. Edge cases are handled properly
 * 
 * Example test scenarios to consider:
 * - Adding items up to capacity
 * - Adding items beyond capacity
 * - Getting non-existent items
 * - Updating existing items
 * - Accessing items in different orders
 * - Empty cache behavior
 * - Single item cache behavior
 */
class LRUCacheTest {
    
    @Test
    void basicPutAndGet() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
    }
} 