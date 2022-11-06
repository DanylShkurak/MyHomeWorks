import homework13.part1.classes.Father;
import homework13.part1.classes.Mother;
import homework13.part1.interfaces.Grow;
import homework13.part1.interfaces.Live;
import homework13.part1.interfaces.Sleep;
import homework13.part1.interfaces.Work;
import homework13.part2.Service;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Sleep.seeNightmare();
        Grow.getWiser();
        Live.saySomething();
        Work.takeRest();

        Father father = new Father();
        father.breathe();
        father.getSalary();

        Mother mother = new Mother();
        mother.breathe();
        mother.wakeUp();

        System.out.println();

        String string = "namesurname@mail.com";
        Service.checkAndReturnOptionalResult(string);

        String stringNull = null;
        Optional<String> optional = Service.checkAndReturnOptionalResult(stringNull);
        ;
        optional.get();

    }
}