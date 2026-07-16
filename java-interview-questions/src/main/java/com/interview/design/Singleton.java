package com.interview.design;

/**
 * Problem: Implement the Singleton design pattern in a thread-safe way,
 * ensuring lazy initialization (the instance isn't created until first
 * needed) without paying a synchronization cost on every call.
 *
 * Approach: Initialization-on-demand holder idiom. The JVM guarantees that
 * a class's static fields are initialized lazily and thread-safely the
 * first time the class is referenced, so the holder class is only loaded
 * (and the instance only created) the first time getInstance() is called —
 * no explicit locking needed.
 *
 * An alternative, also shown for comparison, is a double-checked-locking
 * singleton using a volatile field.
 */
public class Singleton {

    private Singleton() {
        // private constructor prevents external instantiation
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    /** Double-checked-locking alternative, kept here for comparison/teaching. */
    public static class DoubleCheckedSingleton {
        private static volatile DoubleCheckedSingleton instance;

        private DoubleCheckedSingleton() {
        }

        public static DoubleCheckedSingleton getInstance() {
            DoubleCheckedSingleton result = instance;
            if (result == null) {
                synchronized (DoubleCheckedSingleton.class) {
                    result = instance;
                    if (result == null) {
                        instance = result = new DoubleCheckedSingleton();
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println("Same instance: " + (a == b));
    }
}
