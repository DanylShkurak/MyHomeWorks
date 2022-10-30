package homework13.part2;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {
    public static Optional<String> checkAndReturnOptionalResult(String stringForOptional) {
        return Optional.ofNullable(returnTrueIfARegex(stringForOptional));
    }

    private static String returnTrueIfARegex(String stringForRegex) {
        if (stringForRegex == null || stringForRegex.isEmpty()) {
            return null;
        }
        String regexForMail = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexForMail);
        Matcher matcher = pattern.matcher(stringForRegex);
        System.out.println(stringForRegex + " : " + matcher.matches());
        return stringForRegex;
    }
}

