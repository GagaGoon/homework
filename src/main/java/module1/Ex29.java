package module1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex29 {

    public static String charactersLines(String[] roles, String[] textLines) {
        //создаем массив ролей и соответствующих им реплик
        StringBuilder[][] charactersLinesSBArray = new StringBuilder[2][roles.length];

        for (int i = 0; i < roles.length; ++i) {
            charactersLinesSBArray[0][i] = new StringBuilder(roles[i]);
            charactersLinesSBArray[1][i] = new StringBuilder(roles[i] + ":");
        }


        Pattern characterPattern = Pattern.compile("^[а-яА-Я\\w ]+(?=:)");
        Matcher characterMatcher;


        //проходка по сценарию
        for (int i = 0; i < textLines.length; ++i) {
            //находим роль в текущей реплике
            characterMatcher = characterPattern.matcher(textLines[i]);
            characterMatcher.find();


            //выделяем новую реплику
            String newReplica = new String("\n" + (i + 1) + ")" + textLines[i].substring(characterMatcher.end() + 1));


            //находим позицию нужной роли
            int positionInRoles;
            for (positionInRoles = 0; positionInRoles < roles.length; ++positionInRoles) {
                if (characterMatcher.group().equals(charactersLinesSBArray[0][positionInRoles].toString())) {
                    break;
                }
            }


            //записываем найденную реплику нужному персонажу
            charactersLinesSBArray[1][positionInRoles] = charactersLinesSBArray[1][positionInRoles].append(newReplica);
        }


        //записываем все реплики персонажей в один элемент
        StringBuilder charactersLinesSB = new StringBuilder();
        for (int i = 0; i < roles.length; ++i) {
            charactersLinesSB.append("\n\n").append(charactersLinesSBArray[1][i]);
        }

        return charactersLinesSB.toString();
    }

    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                , "Аммос Федорович: Как ревизор?"
                , "Артемий Филиппович: Как ревизор?"
                , "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                , "Аммос Федорович: Вот те на!"
                , "Артемий Филиппович: Вот не было заботы, так подай!"
                , "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(charactersLines(roles, textLines));
    }
}
