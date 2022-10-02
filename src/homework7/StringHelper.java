package homework7;

public class StringHelper {
    public String makeNewString(String string, char[] charArray) {
        String str = "error";
        if (charArray == null) {
            System.out.println("Array = null");
            return str;
        }
        String s = String.valueOf(charArray);
        if (string.isEmpty() || s.isEmpty()) {
            System.out.println("Line is empty");
            return str;
        }
        string = string.trim().toUpperCase();
        s = s.trim().toLowerCase();
        String finalString = string.concat(" ").concat(s);
        if (finalString.length() % 2 == 0) {
            String substring = finalString.substring(finalString.length() / 2 - 1, finalString.length() / 2 + 1);
            return substring;
        } else {
            char charAt = finalString.charAt(finalString.length() / 2 + 1);
            return String.valueOf(charAt);
        }

    }
}

