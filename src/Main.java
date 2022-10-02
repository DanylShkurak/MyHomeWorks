import homework7.RegExMethods;
import homework7.StringHelper;

public class Main {

    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        String string = "hi";
        char[] chars = {'a', 'm', 'i', 'g', 'o', '!', '!'};
        System.out.println("new String is: " + stringHelper.makeNewString(string, chars));
        RegExMethods regExMethods = new RegExMethods();
        regExMethods.isAPhoneNumber("+380988523446");
        regExMethods.isAMail("danyl@gmail.com");
        regExMethods.isBirthDate("11.10.2005");

    }
}