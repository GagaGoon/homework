package module1;

public class Ex14 {
    public static boolean isWeekend(int weekDayNumber){
        if(weekDayNumber == 1){
            return false;
        }
        else if(weekDayNumber == 2){
            return false;
        }
        else if(weekDayNumber == 3){
            return false;
        }
        else if(weekDayNumber == 4){
            return false;
        }
        else if(weekDayNumber == 5){
            return false;
        }
        else if(weekDayNumber == 6){
            return true;
        }
        else if(weekDayNumber == 7){
            return true;
        }
        else{
            System.out.println("Oooops, something wrong");
            return false;
        }
    }
}
