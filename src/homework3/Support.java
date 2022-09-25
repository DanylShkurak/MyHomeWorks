package homework3;
public class Support extends  User {


    @Override
    public String write() {
        return isContains(super.write());
    }
    public String isContains(String s){
        if (User.song.contains(s)){
            return "true";
        }else{
            return "false";
        }}
}