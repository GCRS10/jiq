package com.interview.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Problem: Implement a thread-safe counter that many threads can increment
 * concurrently without losing updates (the classic race-condition demo).
 *
 * Approach: Two correct implementations are shown for comparison:
 *   1) `synchronized` methods — simple, uses intrinsic locking.
 *   2) AtomicInteger — lock-free, uses compare-and-swap under the hood and
 *      is generally preferred for a simple counter due to lower contention
 *      overhead.
 *
 * Time:  O(1) per increment for both approaches
 * Space: O(1)
 */
public class ThreadSafeCounter {

    public static class SynchronizedCounter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized int get() {
            return count;
        }
    }

    public static class AtomicCounter {
        private final AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            count.incrementAndGet();
        }

        public int get() {
            return count.get();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();
        int threadCount = 10;
        int incrementsPerThread = 1000;

        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementsPerThread; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("Final count: " + counter.get()
                + " (expected " + (threadCount * incrementsPerThread) + ")");
    }
}
