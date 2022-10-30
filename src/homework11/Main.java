package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        InitializationData initializationData = new InitializationData();
        Information information = initializationData.setInformation();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(information.getUserInfo());
        System.out.println(addNewUserToUserInfoMap(integers, information).getUserInfo());

    }

    private static Information addNewUserToUserInfoMap(ArrayList<? extends Number> list, Information information) {

        String stringValueOfNumberList = "";
        for (Number iterator : list) {
            stringValueOfNumberList = stringValueOfNumberList + (String.valueOf(iterator));
        }
        ArrayList<String> userNikName = information.getUserNikName();
        userNikName.add(stringValueOfNumberList);
        HashSet<String> userMail = information.getUserMail();
        if (!userMail.contains(stringValueOfNumberList.concat("@"))) {
            userMail.add(stringValueOfNumberList.concat("@mail.com"));
            HashMap<String, String> userInfo = information.getUserInfo();
            userInfo.put(stringValueOfNumberList.concat("@mail.com"), stringValueOfNumberList);
        } else {
            System.err.println("Mail already exist");
        }
        return information;
    }
}

