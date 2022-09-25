package homework3;

public class Main {
    public static void main(String[] args) {
        Support support = new Support();
        User user = new User();
        Admin admin = new Admin();
        writeSomething(user);
    }
    public static void writeSomething(User user){
        if(user instanceof Admin ){
            user.write();
            System.out.println("Admin");
        }else if(user instanceof Support ){
            user.write();
            System.out.println("Support");
        }else if( user instanceof User){
            user.write();
            System.out.println("User");}
    }
}
