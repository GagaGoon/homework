package org.example;

public class App {
    public static void maxMin(double array[]) {
        double max = array[0], min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min: " + min + "\nmax: " + max);
    }

    public static void main(String[] args) {
        double a[] = {1, 45, 34, 5, 54, 6, 756, 73, 46, -1};
        maxMin(a);
    }
}
