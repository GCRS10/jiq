# Java Interview Questions

A curated collection of common Java coding interview questions, organized by topic,
each with a documented solution and a JUnit test. Built with Maven so it runs and
compiles out of the box.

## Structure

```
java-interview-questions/
├── docs/                     # Problem statements & explanations, one file per topic
├── src/main/java/com/interview/
│   ├── arrays/                Two Sum, Max Subarray (Kadane), Rotate Array
│   ├── strings/                Palindrome, Anagram, Longest Substring w/o Repeats
│   ├── linkedlist/             Reverse List, Detect Cycle, Merge Sorted Lists
│   ├── trees/                  Traversals, Lowest Common Ancestor, Validate BST
│   ├── sorting/                Binary Search, QuickSort, MergeSort
│   ├── dp/                     Fibonacci (memo), Coin Change, LCS
│   ├── design/                 Singleton, Observer pattern
│   └── concurrency/            Producer-Consumer, Thread-safe Counter
└── src/test/java/com/interview/   JUnit 5 tests mirroring the package layout above
```

Every solution class has:
- A Javadoc block describing the problem, approach, and Big-O complexity.
- A clean, dependency-free implementation.
- A matching test class (where applicable) under `src/test`.

The `docs/` folder has the plain-English problem statements if you want to
attempt a question yourself before looking at the solution.

## Requirements

- JDK 17+
- Maven 3.8+

## Build & Test

```bash
mvn test
```

## Run an individual example

Most classes expose a small `main` method for a quick manual run, e.g.:

```bash
mvn compile exec:java -Dexec.mainClass="com.interview.arrays.TwoSum"
```

(or just run the class from your IDE).

## Topics covered

| Topic | Questions |
|---|---|
| Arrays | Two Sum, Maximum Subarray, Rotate Array |
| Strings | Palindrome Check, Anagram Check, Longest Substring Without Repeating Characters |
| Linked Lists | Reverse a Linked List, Detect a Cycle (Floyd's), Merge Two Sorted Lists |
| Trees | Preorder/Inorder/Postorder/Level-order Traversal, Lowest Common Ancestor, Validate BST |
| Sorting & Searching | Binary Search, QuickSort, MergeSort |
| Dynamic Programming | Fibonacci with Memoization, Coin Change, Longest Common Subsequence |
| Design Patterns | Thread-safe Singleton, Observer Pattern |
| Concurrency | Producer-Consumer, Thread-safe Counter |

## Adding a new question

1. Add the solution class under the right `src/main/java/com/interview/<topic>` package.
2. Add a matching test under `src/test/java/com/interview/<topic>`.
3. Add a short write-up in `docs/`.
4. Update the table above.

## License

Free to use for personal interview prep.
