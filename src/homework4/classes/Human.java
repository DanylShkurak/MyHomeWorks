package homework4.classes;


import homework4.interfaces.Live;

public abstract class Human implements Live {
    private int age;
    private String sex;
    public  void live(){
        System.out.println("live");
    }

    public Human() {
    }

    public Human(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
