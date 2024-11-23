package module1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex21 {
    public static void printArray(int[] numbers) {
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
    }
}
