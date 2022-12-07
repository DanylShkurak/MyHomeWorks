package homework19.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomLock {
    Lock lock = new ReentrantLock();

    public void logIn() {
        lock.lock();
        System.out.println("Access confirmed");

    }

    public void call() {
        System.out.println("calling...");
    }

    public void logOut() {
        System.out.println("You are logged out");
        lock.unlock();
    }
}
