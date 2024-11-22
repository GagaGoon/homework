package module1;

public class Ex13 {
    public static boolean isWeekend(String weekDayNumber) {
        switch (weekDayNumber) {
            case "Monday":
                return false;
            case "Tuesday":
                return false;
            case "Wednesday":
                return false;
            case "Thursday":
                return false;
            case "Friday":
                return false;
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                System.out.println("Oooops, something wrong");
                return false;
        }
    }
}
