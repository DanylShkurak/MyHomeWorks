package homework4.classes;

public final class Bee extends Insects {
    private int weight;
    private String sound;

    public void makeSound() {
        System.out.println("Bee make bzzzzz");
    }

    @Override
    public void eat() {
        System.out.println("Bee should eat");
    }

    @Override
    public void drink() {
        System.out.println("Bee should drink");
    }

    @Override
    public void breed() {
        System.out.println("Bee can breed");
    }

    @Override
    public void feed() {
        System.out.println("Bee can feed");
    }

    @Override
    public void hide() {
        System.out.println("Bee can hide");
    }

    @Override
    public void defence() {
        System.out.println("Bee can defend");
    }

    public Bee() {
    }

    public Bee(int weight, String sound) {
        this.weight = weight;
        this.sound = sound;
    }

    public Bee(int legs, int eyes, int weight, String sound) {
        super(legs, eyes);
        this.weight = weight;
        this.sound = sound;
    }

    public Bee(String name, int age, int legs, int eyes, int weight, String sound) {
        super(name, age, legs, eyes);
        this.weight = weight;
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
