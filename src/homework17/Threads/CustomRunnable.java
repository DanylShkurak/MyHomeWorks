package homework17.Threads;

import homework17.entity.ThreadService;

public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from CustomRunnable");
        for (int i = 0; i < 1000; i++) {
            ThreadService.service();
        }
    }
}