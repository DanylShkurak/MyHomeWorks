package homework13.part1.interfaces;

public interface Work extends Grow {
    default void breathe() {
        System.out.println("Breathe while work");
    }

    static void takeRest() {
        System.out.println("Stop work");
    }

    void getSalary();

    void carryBoxes();
}