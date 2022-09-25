package homework4.classes;


public abstract class Man extends Human {
    private int height;
    private int weight;
    public  void sleep(){
        System.out.println("Should sleep");
    }

    @Override
    public void live() {
        super.live();
    }

    public Man() {
    }

    public Man(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Man(int age, String sex, int height, int weight) {
        super(age, sex);
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
