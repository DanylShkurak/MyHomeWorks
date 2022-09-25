package homework4.classes;
public final class Ant extends Insects {
    private int size;
    private String color;

    public void carry() {
        System.out.println("Ant can carry");
    }

    @Override
    public void breed() {
        System.out.println("Ant's queen can breed");
    }

    @Override
    public void feed() {
        System.out.println("Ant's queen can feed ");
    }

    @Override
    public void hide() {
        System.out.println("Ant can hide");
    }

    @Override
    public void defence() {
        System.out.println("Ant can't defence");
    }

    @Override
    public void eat() {
        System.out.println("Ant should eat");
    }

    @Override
    public void drink() {
        System.out.println("Ant should drink");
    }

    public Ant() {
    }

    public Ant(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Ant(int legs, int eyes, int size, String color) {
        super(legs, eyes);
        this.size = size;
        this.color = color;
    }

    public Ant(String name, int age, int legs, int eyes, int size, String color) {
        super(name, age, legs, eyes);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

