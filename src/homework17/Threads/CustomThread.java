package homework17.Threads;

import homework17.entity.ThreadService;

public class CustomThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from CustomThread ");
        for (int i = 0; i < 1000; i++) {
            ThreadService.service();
        }

    }
}
