package homework13.part1.interfaces;

public interface Grow {
    default void breathe() {
        System.out.println("Breathe while grow");
    }

    static void getWiser() {
        System.out.println("Get wiser");
    }

    void getTaller();

    void getStronger();
}
