package homework4;


import homework4.classes.*;

public class Main {
    public static void main(String[] args) {
        //На примере муравья и дедушки  показал работу  методов .
        Son son = new Son();
        Father father = new Father();
        Grandfather grandfather = new Grandfather(69,"Man",180,90,"Charlie",true);
        grandfather.live();
        grandfather.die();
        grandfather.getFun();
        grandfather.getOlder();
        grandfather.getWiser();
        grandfather.lastWords();
        grandfather.sleep();
        Bee bee = new Bee();
        Mosquito mosquito = new Mosquito();
        Ant ant = new Ant("Anton", 3, 6, 2, 3, "black");
        ant.breed();
        ant.carry();
        ant.defence();
        ant.drink();
        ant.eat();
        ant.feed();
        ant.hide();
        ant.move();
    }
}
