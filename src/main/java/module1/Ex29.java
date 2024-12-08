package module1;

import java.util.Arrays;
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
        //создаем массив ролей и соответствующих им реплик
        StringBuilder[][] charactersLinesSBArray = new StringBuilder[2][roles.length];
        for (int i = 0; i < roles.length; ++i) {
            charactersLinesSBArray[0][i] = new StringBuilder(roles[i]);
            charactersLinesSBArray[1][i] = new StringBuilder().append(roles[i] + ":");
        }


        Pattern characterPattern = Pattern.compile("^[а-яА-Я\\w ]+(?=:)");
        Matcher characterMatcher;


        //проходка по сценарию
        for (int i = 0; i < textLines.length; ++i) {
            //находим роль в текущей реплике
            characterMatcher = characterPattern.matcher(textLines[i]);
            characterMatcher.find();


            //выделяем новую реплику
            String newReplica = new String("\n" + i + ")" + textLines[i].substring(characterMatcher.end() + 1));


            //находим нужную роль
            int positionInRoles = Arrays.binarySearch(charactersLinesSBArray, characterMatcher.group());


            //записываем найденную реплику нужному персонажу
            charactersLinesSBArray[1][positionInRoles] = charactersLinesSBArray[1][positionInRoles].append(newReplica);
        }


        StringBuilder charactersLinesSB = new StringBuilder();
        return charactersLinesSB.toString();
    }
}
