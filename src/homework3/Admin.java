package homework3;

public class Admin extends  User{
    Support support = new Support();
    public String write() {
        String s = super.write();
        if(support.isContains(s).contains("true")) User.song=null;
        else System.out.println("Not contains");
        return null;
    }
}