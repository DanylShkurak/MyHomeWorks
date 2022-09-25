package homework4.classes;
public abstract class  Insects extends Animal {
    private int legs;
    private int eyes;
    public void move(){
        System.out.println("Can move");
    }

    @Override
    public void breathe() {
        super.breathe();
    }

    public Insects() {
    }

    public Insects(int legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    public Insects(String name, int age, int legs, int eyes) {
        super(name, age);
        this.legs = legs;
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
