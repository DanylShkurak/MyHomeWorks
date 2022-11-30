package homework17.entity;

public class ThreadService {
    private static int value;
    public static int service(){
        value++;
        System.out.println(Thread.currentThread().getName() + " "+ "value is " + value);
        return value;
    }

    public static int getValue() {
        return value;
    }
}
