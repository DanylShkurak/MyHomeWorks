package homework19.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class SecondThreadInThreadPool implements Runnable {

    private final AtomicInteger atomicInteger;


    public SecondThreadInThreadPool(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    @Override
    public void run() {
        System.out.println("Created " + Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(atomicInteger::decrementAndGet);
            thread.start();
        }
    }
}

