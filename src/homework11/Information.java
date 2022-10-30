package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Information {
    private ArrayList<String> userNikName ;
    private HashSet<String> userMail;
    private HashMap<String,String> userInfo;

    public Information() {
    }

    public Information(ArrayList<String> userNikName) {
        this.userNikName = userNikName;
    }

    public Information(ArrayList<String> userNikName, HashSet<String> userMail) {
        this.userNikName = userNikName;
        this.userMail = userMail;
    }

    public Information(ArrayList<String> userNikName, HashSet<String> userMail, HashMap<String,String> userInfo) {
        this.userNikName = userNikName;
        this.userMail = userMail;
        this.userInfo = userInfo;
    }

    public ArrayList<String> getUserNikName() {
        return userNikName;
    }

    public void setUserNikName(ArrayList<String> userNikName) {
        this.userNikName = userNikName;
    }

    public HashSet<String> getUserMail() {
        return userMail;
    }

    public void setUserMail(HashSet<String> userMail) {
        this.userMail = userMail;
    }

    public HashMap<String,String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(HashMap<String,String> userInfo) {
        this.userInfo = userInfo;
    }
}
