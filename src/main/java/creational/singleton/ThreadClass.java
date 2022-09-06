package main.java.creational.singleton;

public class ThreadClass extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println(Singleton.getSingleInstance());
        }
    }

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}
