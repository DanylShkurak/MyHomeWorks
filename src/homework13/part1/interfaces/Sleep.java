package homework13.part1.interfaces;

public interface Sleep {
    default void breathe() {
        System.out.println("Breathe while sleep");
    }

    static void seeNightmare() {
        System.out.println("| |");
    }

    void grow();

    void wakeUp();
}
