package module1;

public class Ex17 {
    public static void getSubArrayBetween(int[] numbers, int start, int end) {

        System.out.print("[ ");
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start && numbers[i] < end) {
                if (a == 0) {
                    ++a;
                } else {
                    System.out.print(", ");
                }
                System.out.print(numbers[i]);
            }
        }
        System.out.println(" ]");

    }
}
