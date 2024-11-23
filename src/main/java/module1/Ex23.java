package module1;

import java.util.Arrays;

public class Ex23 {
    public static void mergeAndSort(int[] firstArray, int[] secondArray){
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int[] resultArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        System.out.println(Arrays.toString(resultArray));
    }
}
