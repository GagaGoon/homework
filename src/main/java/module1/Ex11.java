package module1;

import java.math.BigInteger;

public class Ex11 {
    public static BigInteger factorial(int n) {
        if (n < 1) {
            return BigInteger.valueOf(-1);
        }
        if (n != 1) {
            return factorial(n - 1).multiply(BigInteger.valueOf(n));
        } else {
            return BigInteger.ONE;
        }
    }
}
