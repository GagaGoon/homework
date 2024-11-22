package module1;

public class Ex17 {
    public static void getSubArrayBetween(int[] numbers, int start, int end) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start && numbers[i] < end) {
                System.out.println(numbers[i]);
            }
        }
    }
}
