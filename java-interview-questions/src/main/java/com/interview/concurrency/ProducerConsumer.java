package com.interview.concurrency;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem: Implement the classic Producer-Consumer problem using a bounded
 * buffer shared between producer and consumer threads.
 *
 * Approach: A synchronized bounded queue. Producers wait() while the buffer
 * is full; consumers wait() while it's empty. Each side calls notifyAll()
 * after modifying the buffer so the other side can re-check its condition.
 * Using wait()/notifyAll() inside a synchronized block (with the condition
 * re-checked in a while loop, not an if) avoids missed signals and spurious
 * wakeups.
 *
 * Time:  O(1) per produce/consume operation
 * Space: O(capacity)
 */
public class ProducerConsumer {

    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public ProducerConsumer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
