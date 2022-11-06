package homework13.part1.interfaces;

public interface Live {
    default void breathe() {
        System.out.println("Breathe while live");
    }

    static void saySomething() {
        System.out.println("Hello");
    }

    void chill();

    void getUpset();
}
