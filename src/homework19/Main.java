package homework19;

import homework19.deadlock.FirstUser;
import homework19.deadlock.SecondUser;
import homework19.entity.CustomLock;
import homework19.entity.SecondThreadInThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static AtomicInteger counter = new AtomicInteger(20000);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(Main::createFirstThread);
        executorService.execute(new SecondThreadInThreadPool(counter));
        Thread.sleep(2000);
        System.out.println("counter value = " + counter.get());
        executorService.shutdown();

        CustomLock customLock = new CustomLock();
        for (int i = 0; i < 3; i++) {
            Thread threadForLockExample = new Thread(() -> {
                customLock.logIn();
                customLock.call();
                customLock.logOut();
            });
            threadForLockExample.start();
        }

        FirstUser firstUser = new FirstUser();
        SecondUser secondUser = new SecondUser();

        secondUser.setFirstUser(firstUser);
        firstUser.setSecondUser(secondUser);

        Thread threadForFirstUSer = new Thread(() -> System.out.println(firstUser.callSecondUser()));
        Thread threadForSecondUSer = new Thread(() -> System.out.println(secondUser.callFirstUser()));
        threadForFirstUSer.start();
        threadForSecondUSer.start();

    }

    private static void createFirstThread() {
        System.out.println("Created " + Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            Thread threadForFirstThreadInPool = new Thread(counter::decrementAndGet);
            threadForFirstThreadInPool.start();
        }
    }
}
