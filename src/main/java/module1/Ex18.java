package module1;

public class Ex18 {
    public static void getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("[]");
        } else if (numbers.length % 2 == 1) {
            System.out.println("[ " + numbers[numbers.length / 2] + " ]");
        } else {
            System.out.print("[ " + numbers[numbers.length / 2 - 1] + ", " + numbers[numbers.length / 2] + " ]");
        }
    }
}
