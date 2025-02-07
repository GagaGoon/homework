package productstar;

public class Cycles {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("fizz ");
            }
            else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("buzz ");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
