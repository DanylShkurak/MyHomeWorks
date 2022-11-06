package homework13.part1.classes;

import homework13.part1.interfaces.Grow;
import homework13.part1.interfaces.Work;

public class Father implements Grow, Work {


    @Override
    public void getTaller() {

    }

    @Override
    public void getStronger() {

    }


    @Override
    public void getSalary() {
        System.out.println("+1000$");
    }

    @Override
    public void carryBoxes() {

    }
}
