package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class InitializationData {
    public Information setInformation() {
        Information information = new Information();
        ArrayList<String> userNikName = new ArrayList<>();
        HashSet<String> userMail = new HashSet<>();
        HashMap<String, String> userInfo = new HashMap<>();
        for (int i = 0; i < 30; i++) {
            Integer randomize = (int) (Math.random() * 31);
            Integer randomizer = (int) (Math.random() * 100) + 50;

            while (userNikName.contains(String.valueOf(randomize))) {
                randomize = (int) (Math.random() * 30);
            }
            String fillNickNameCollection = String.valueOf(randomize);
            userNikName.add(fillNickNameCollection);
            while (userMail.contains(String.valueOf(randomizer).concat("@"))) {
                randomizer = (int) (Math.random() * 30) + 30;
            }
            String fillMailCollection = String.valueOf(randomizer).concat("@");
            userMail.add(fillMailCollection);
            userInfo.put(fillMailCollection, fillNickNameCollection);


        }
        String sameValue = "20";
        while (userNikName.contains(sameValue) || userMail.contains(sameValue.concat("@"))){
            sameValue = String.valueOf(Integer.parseInt(sameValue)*3);
        }

        for (int i = 0; i < 10; i++) {
            userMail.add(String.valueOf(sameValue.concat("@")));
            userNikName.add(String.valueOf(sameValue));
            userInfo.put(String.valueOf(sameValue.concat("@")), String.valueOf(sameValue));
        }



        if (isSizeTheSame(userNikName, userMail, userInfo)) {
            information.setUserNikName(userNikName);
            information.setUserMail(userMail);
            information.setUserInfo(userInfo);
        }
        System.out.println("isSizeTheSame: " + isSizeTheSame(userNikName, userMail, userInfo));
        return information;
    }

    private boolean isSizeTheSame(ArrayList<String> userNikName, HashSet<String> userMail, HashMap<String, String> userInfo) {
        if (userNikName.size() != userMail.size()) {
            HashSet<String> removeAllSameValues = new HashSet<>(userNikName);
            userNikName.clear();
            userNikName.addAll(removeAllSameValues);
        }

        if (userNikName.size() == userMail.size() && userMail.size() == userInfo.size()) {
            return true;
        }
        return false;
    }
}
