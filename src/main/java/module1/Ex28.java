package module1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex28 {
    public static boolean isGmailOrOutlook(String email){
        String regEx = "[a-zA-Z0-9]+@(gmail.com|outlook.com)";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("@outlook.com"));
    }
}
