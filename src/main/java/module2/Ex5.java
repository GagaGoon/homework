package module2;

public class Ex5 {
    public static boolean isWeekend(String dayName){
        return dayName.equals("Saturday") || dayName.equals("Sunday");
    }

    public static int weekendCount(String[] days){
        int count = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days){
        int count = 0;
        for (String day : days) {
            if (!isWeekend(day)) {
                count++;
            }
        }
        return count;
    }
}
