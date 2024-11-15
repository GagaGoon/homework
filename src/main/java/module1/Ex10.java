package module1;

import java.math.BigInteger;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
