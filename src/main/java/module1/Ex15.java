package module1;

public class Ex15 {
    public static String checkWeekend(String weekday){
        String weekend = weekday == "Saturday" ? "Ура, выходной!" : weekday == "Sunday" ? "Ура, выходной!" :
                "Надо еще поработать";
        return weekend;
    }
}
