package module1;

public class Ex20 {
    public static void mergeAndSort(int[] firstArray, int[] secondArray) {

        //sort first array
        for (int i = 0; i < firstArray.length; ++i) {
            for (int j = i + 1; j < firstArray.length; ++j) {
                if (firstArray[i] > firstArray[j]) {
                    int temp = firstArray[i];
                    firstArray[i] = firstArray[j];
                    firstArray[j] = temp;
                }
            }
        }

        //sort second array
        for (int i = 0; i < secondArray.length; ++i) {
            for (int j = i + 1; j < secondArray.length; ++j) {
                if (secondArray[i] > secondArray[j]) {
                    int temp = secondArray[i];
                    secondArray[i] = secondArray[j];
                    secondArray[j] = temp;
                }
            }
        }

        //merge arrays
        System.out.print("[ ");
        int i = 0, j = 0, k = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (k > 0) {
                System.out.print(", ");
            } else {
                ++k;
            }
            if (firstArray[i] > secondArray[j]) {
                System.out.print(secondArray[j]);
                ++j;
            } else {
                System.out.print(firstArray[i]);
                ++i;
            }
        }

        if (i < firstArray.length) {
            for (; i < firstArray.length; ++i) {
                System.out.print(", ");
                System.out.print(firstArray[i]);
            }
        } else {
            for (; j < secondArray.length; ++j) {
                System.out.print(", ");
                System.out.print(secondArray[j]);
            }
        }
        System.out.print(" ]");
    }
}
