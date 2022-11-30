package homework17;

import homework17.Threads.CustomCallable;
import homework17.Threads.CustomRunnable;
import homework17.Threads.CustomThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();
        customThread.join();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread threadForRunnable = new Thread(customRunnable);
        threadForRunnable.start();
        threadForRunnable.join();

        CustomCallable customCallable = new CustomCallable();
        FutureTask<Integer> intForFutureTask = new FutureTask<> (customCallable);
        Thread threadForCallable = new Thread(intForFutureTask);
        threadForCallable.start();
        threadForCallable.join();
        Integer result = intForFutureTask.get();


        System.out.println("result is (just some random text for easy find result in console) " + result);


    }
}
