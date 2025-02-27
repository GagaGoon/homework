package module2;

public class Ex2 {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println(day.isWeekend());
        System.out.println(day.getRusName());
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    public String getRusName() {
        switch (this) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            case SUNDAY:
                return "Воскресенье";
            default:
                return "";
        }
    }
}