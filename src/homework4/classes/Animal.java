package homework4.classes;



import homework4.interfaces.Breed;
import homework4.interfaces.Eat;

public abstract class Animal implements Breed, Eat {
    private String name;
    private int age;

    public void breathe() {
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
