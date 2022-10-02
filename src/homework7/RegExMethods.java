package homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMethods {
    public void isAPhoneNumber(String string) {
        Pattern pattern = Pattern.compile("^((\\+?)(38)?(0\\d{2})(\\d{5})(\\d{2}))$");
        Matcher matcher = pattern.matcher(string);
        System.out.println("is a ".concat(string).concat(" phone number? \n") + matcher.matches());
    }

    public void isAMail(String string) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(string);
        System.out.println("is a ".concat(string).concat(" mail? \n") + matcher.matches());
    }

    public void isBirthDate(String string) {
        Pattern pattern = Pattern.compile("(0[1-9]|[12]\\d|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
        Matcher matcher = pattern.matcher(string);
        System.out.println("is a ".concat(string).concat(" birthdate? \n") + matcher.matches());

    }
}