package module1;

import java.util.Arrays;

public class Ex22 {
    public static void getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("[]");
        } else if (numbers.length % 2 == 0) {
            int[] numbersCopy = new int[2];
            System.arraycopy(numbers, numbers.length / 2 - 1, numbersCopy, 0, 2);
            System.out.println(Arrays.toString(numbersCopy));
        } else {
            int[] numbersCopy = new int[1];
            System.arraycopy(numbers, numbers.length / 2, numbersCopy, 0, 1);
            System.out.println(Arrays.toString(numbersCopy));
        }
    }
}
