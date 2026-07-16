package com.interview.design;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Implement the Observer design pattern — a subject maintains a
 * list of dependents (observers) and notifies them automatically of any
 * state changes.
 *
 * Approach: A Subject interface with subscribe/unsubscribe/notify methods,
 * an Observer interface with an update callback, and a concrete Subject
 * implementation (a simple news publisher) that stores observers in a list
 * and calls update() on each when its state changes.
 */
public class ObserverPattern {

    public interface Observer {
        void update(String event);
    }

    public interface Subject {
        void subscribe(Observer observer);
        void unsubscribe(Observer observer);
        void notifyObservers(String event);
    }

    public static class NewsPublisher implements Subject {
        private final List<Observer> observers = new ArrayList<>();

        @Override
        public void subscribe(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void unsubscribe(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers(String event) {
            for (Observer observer : observers) {
                observer.update(event);
            }
        }
    }

    public static class ConsoleSubscriber implements Observer {
        private final String name;

        public ConsoleSubscriber(String name) {
            this.name = name;
        }

        @Override
        public void update(String event) {
            System.out.println(name + " received: " + event);
        }
    }

    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        publisher.subscribe(new ConsoleSubscriber("Alice"));
        publisher.subscribe(new ConsoleSubscriber("Bob"));
        publisher.notifyObservers("Breaking news!");
    }
}
