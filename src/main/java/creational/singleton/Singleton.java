package main.java.creational.singleton;

/*
 *  Singleton Design Pattern
 * */

public class Singleton {

    private static Singleton singleInstance = null;

    private Singleton() {}

    public synchronized static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
