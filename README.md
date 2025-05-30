# Interview Coding Challenges

This repository contains a collection of coding challenges commonly used in technical interviews. Each challenge is set up as a Gradle project with JUnit 5 tests.

## Project Structure

```
src/
├── main/
│   └── java/
│       └── com/
│           └── interview/
│               ├── fizzbuzz/
│               │   └── FizzBuzz.java (CHALLENGE 1)
│               ├── lrucache/
│               │   └── LRUCache.java
│               └── reversewords/
│                   └── WordReverser.java (CHALLENGE 2)
└── test/
    └── java/
        └── com/
            └── interview/
                ├── fizzbuzz/
                │   └── FizzBuzzTest.java
                ├── lrucache/
                │   └── LRUCacheTest.java (CHALLENGE 3)
                └── reversewords/
                    └── WordReverserTest.java
```

## Prerequisites

- Java 17 or higher
- Gradle 7.0 or higher

## Setup

1. Clone the repository:
```bash
git clone https://github.com/tmstuckman/java-interview-template.git
cd interview-template
```

2. Build the project without testing (sanity check):

Mac:
```bash
./gradlew build -x test  # Uses Gradle 8.5 wrapper
```

Windows:
```bash
gradlew.bat build -x test  # Uses Gradle 8.5 wrapper
```

## Running Tests

### Specific Challenge Tests
Mac:
```bash
# FizzBuzz
./gradlew test --tests "com.interview.fizzbuzz.FizzBuzzTest"

# Reverse Words
./gradlew test --tests "com.interview.reversewords.WordReverserTest"

# LRU Cache
./gradlew test --tests "com.interview.lrucache.LRUCacheTest"
```

Windows:
```bash
# FizzBuzz
gradlew.bat test --tests "com.interview.fizzbuzz.FizzBuzzTest"

# Reverse Words
gradlew.bat test --tests "com.interview.reversewords.WordReverserTest"

# LRU Cache
gradlew.bat test --tests "com.interview.lrucache.LRUCacheTest"
```

## Challenges

### 1. FizzBuzz
A classic programming challenge where you need to:
- Print numbers from 1 to n
- Print "Fizz" for multiples of 3
- Print "Buzz" for multiples of 5
- Print "FizzBuzz" for multiples of both 3 and 5

### 2. Reverse Words
Implement a method to reverse the order of words in a sentence:
- Input: "the sky is blue"
- Output: "blue is sky the"
- Words are separated by spaces
- Characters within each word remain in order

### 3. Unit Testing: LRU Cache
A Least Recently Used (LRU) Cache is implemented with the following specs:
- Fixed size cache that evicts least recently used items when full
- O(1) time complexity for get and put operations
- Uses a HashMap and custom doubly linked list
- Does not use LinkedHashMap

Thoroughly unit test the LRU Cache

## Development

1. Each challenge has its own package under `com.interview`
2. Implementation files are in `src/main/java`
3. Test files are in `src/test/java`
4. Run tests to verify your solution


## Contributing

Feel free to:
- Add new challenges
- Improve existing challenges
- Add more test cases
- Enhance documentation 