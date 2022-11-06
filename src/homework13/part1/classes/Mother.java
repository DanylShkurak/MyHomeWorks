package homework13.part1.classes;

import homework13.part1.interfaces.Live;
import homework13.part1.interfaces.Sleep;

public class Mother implements Sleep, Live {
    @Override
    public void breathe() {
        System.out.println("Mother breathe");
    }

    @Override
    public void chill() {

    }

    @Override
    public void getUpset() {

    }


    @Override
    public void grow() {

    }

    @Override
    public void wakeUp() {
        System.out.println("Wake the **** up samurai");
    }
}

