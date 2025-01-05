package module1;

public class Ex24 {
    public static void printOddNumbers(int[] arr){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                if(a == 0){
                    ++a;
                }
                else {
                    System.out.print(",");
                }
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
