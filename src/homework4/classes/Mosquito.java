package homework4.classes;


public final class Mosquito extends Insects {
    private int wings;
    private String type;

    public void fly() {
        System.out.println("Can fly");
    }
    @Override
    public void breed() {
        System.out.println("Mosquito can breed");
    }

    @Override
    public void feed() {
        System.out.println("Mosquito can't feed");
    }

    @Override
    public void hide() {
        System.out.println("Mosquito can hide");
    }
    @Override
    public void defence() {
        System.out.println("Mosquito can defend");

    }
    @Override
    public void eat() {
        System.out.println("Mosquito can eat");
    }

    @Override
    public void drink() {
        System.out.println("Mosquito can drink");
    }
    public Mosquito() {
    }

    public Mosquito(int wings, String type) {
        this.wings = wings;
        this.type = type;
    }

    public Mosquito(int legs, int eyes, int wings, String type) {
        super(legs, eyes);
        this.wings = wings;
        this.type = type;
    }

    public Mosquito(String name, int age, int legs, int eyes, int wings, String type) {
        super(name, age, legs, eyes);
        this.wings = wings;
        this.type = type;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
