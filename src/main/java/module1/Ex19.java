package module1;

public class Ex19 {
    public static void inverseArray(int[] numbers){
        System.out.print("[ ");
        for (int i = numbers.length-1; i>=0;--i){
            System.out.print(numbers[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
