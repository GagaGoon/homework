package module1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex29 {
    public static int characterFind(String[] roles, String neededRole) {
        int i = 0;
        while (!neededRole.equals(roles[i])) {
            ++i;
        }
        return i;
    }

    public static String charactersLines(String[] roles, String[] textLines) {
        StringBuilder charactersLinesSB = new StringBuilder();

        Pattern characterPattern = Pattern.compile("^[а-яА-Я\\w ]+(?=:)");
        Matcher characterMatcher;

        for (int i = 0; i < textLines.length; ++i) {
            characterMatcher = characterPattern.matcher(textLines[i]);

            if (characterMatcher.find()) {
                //проходка по массиву реплик, нахождение в реплике нужной роли
            }
        }

        return charactersLinesSB.toString();
    }
}
