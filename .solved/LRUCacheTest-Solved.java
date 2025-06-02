package com.interview.lrucache;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {
    
    @Test
    void basicPutAndGet() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
    }
    
    @Test
    void getNonExistentKey() {
        LRUCache cache = new LRUCache(2);
        assertEquals(-1, cache.get(1));
    }
    
    @Test
    void overwriteExistingKey() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(1, 2);
        assertEquals(2, cache.get(1));
    }
    
    @Test
    void evictionOrder() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);  // Should evict key 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
        assertEquals(3, cache.get(3));
    }
    
    @Test
    void leastRecentlyUsedEviction() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);     // Make key 1 most recently used
        cache.put(3, 3);  // Should evict key 2
        assertEquals(1, cache.get(1));
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3));
    }
    
    @Test
    void cacheSizeOne() {
        LRUCache cache = new LRUCache(1);
        cache.put(1, 1);
        cache.put(2, 2);  // Should evict key 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }
    
    @Test
    void multipleOperations() {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.get(1);     // Make key 1 most recently used
        cache.put(4, 4);  // Should evict key 2
        assertEquals(1, cache.get(1));
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }
} 