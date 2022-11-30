package homework17.Threads;

import homework17.entity.ThreadService;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello from CustomCallable" );
        for (int i = 0; i < 1000; i++) {
            ThreadService.service();
        }
        return  ThreadService.getValue();
    }
}
