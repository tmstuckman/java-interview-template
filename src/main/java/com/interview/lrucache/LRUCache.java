package com.interview.lrucache;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU (Least Recently Used) Cache Implementation
 * 
 * What is an LRU Cache?
 * An LRU Cache is a fixed-size data structure that stores key-value pairs with the following properties:
 * 1. It has a maximum capacity
 * 2. When the cache is full and a new item needs to be added, it removes the least recently used item
 * 3. Each time an item is accessed (get) or updated (put), it becomes the most recently used item
 * 
 * Real-world Use Case:
 * Imagine a web browser's back/forward cache:
 * - When you visit a webpage, it's stored in the cache
 * - If you visit a page you've seen before, it loads instantly from cache
 * - If the cache gets full, it removes the page you haven't visited in the longest time
 * - This is why your most recently visited pages load faster than older ones
 * 
 * This implementation achieves O(1) time complexity for all operations by using:
 * - A HashMap for O(1) lookups
 * - A custom doubly linked list to maintain the order of recently used items
 */
public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private Node head;  // Most recently used
    private Node tail;  // Least recently used
    
    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = null;
        this.tail = null;
    }
    
    /**
     * Retrieves the value for the given key and marks it as most recently used.
     * Time Complexity: O(1)
     */
    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        
        // Move the accessed node to the front (most recently used)
        moveToFront(node);
        return node.value;
    }
    
    /**
     * Adds or updates a key-value pair in the cache.
     * If the key exists, updates its value and marks it as most recently used.
     * If the key doesn't exist, creates a new entry and evicts the least recently used item if at capacity.
     * Time Complexity: O(1)
     */
    public void put(int key, int value) {
        Node node = cache.get(key);
        
        if (node != null) {
            // Key exists - update value and move to front
            node.value = value;
            moveToFront(node);
        } else {
            // Key doesn't exist - create new node
            node = new Node(key, value);
            cache.put(key, node);
            addToFront(node);
            
            // If at capacity, remove least recently used item
            if (cache.size() > capacity) {
                removeLRU();
            }
        }
    }
    
    /**
     * Moves an existing node to the front of the list (most recently used).
     * Time Complexity: O(1)
     */
    private void moveToFront(Node node) {
        // If node is already at front, nothing to do
        if (node == head) {
            return;
        }
        
        // Remove node from its current position
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        
        // If node was tail, update tail
        if (node == tail) {
            tail = node.prev;
        }
        
        // Add node to front
        addToFront(node);
    }
    
    /**
     * Adds a new node to the front of the list.
     * Time Complexity: O(1)
     */
    private void addToFront(Node node) {
        node.next = head;
        node.prev = null;
        
        if (head != null) {
            head.prev = node;
        }
        
        head = node;
        
        // If this is the first node, set it as tail
        if (tail == null) {
            tail = node;
        }
    }
    
    /**
     * Removes the least recently used item (tail) from the cache.
     * Time Complexity: O(1)
     */
    private void removeLRU() {
        if (tail == null) {
            return;
        }
        
        // Remove from cache
        cache.remove(tail.key);
        
        // Update tail
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            // If tail was the only node, update head
            head = null;
        }
    }
} 