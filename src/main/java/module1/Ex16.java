package module1;

public class Ex16 {
    public static void printArray(int[] numbers) {
        System.out.print("[ ");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + " ]");
    }
}
