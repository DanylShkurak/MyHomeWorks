package homework3;

import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String mail;
    private  int password;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User(String name, String surname, String mail, int password, String country) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.country = country;
    }

    public User() {
    }
    public void read(String string){
        System.out.println(string);
    }
    public  static  String song = "My tea's gone cold, I'm wondering why\n" +
            "I got out of bed at all\n" +
            "The morning rain clouds up my window\n" +
            "And I can't see at all";
    public String write(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something : " );
        String s = scanner.nextLine();
        System.out.println("You entered : " + s);
        return s;
    }
}
