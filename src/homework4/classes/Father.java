package homework4.classes;

public final class Father extends Man {
    private int salary;
    private int babies;

    public void work() {
        System.out.println("Father work in bank");
    }

    @Override
    public void die() {
        System.out.println("Father will die in 49");
    }

    @Override
    public void lastWords() {
        System.out.println("No");
    }

    @Override
    public void getOlder() {
        System.out.println("Father is getting older");
    }

    @Override
    public void getFun() {
        System.out.println("Get fun with friends");
    }

    public Father() {
    }

    public Father(int salary, int babies) {
        this.salary = salary;
        this.babies = babies;
    }

    public Father(int height, int weight, int salary, int babies) {
        super(height, weight);
        this.salary = salary;
        this.babies = babies;
    }

    public Father(int age, String sex, int height, int weight, int salary, int babies) {
        super(age, sex, height, weight);
        this.salary = salary;
        this.babies = babies;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBabies() {
        return babies;
    }

    public void setBabies(int babies) {
        this.babies = babies;
    }
}
