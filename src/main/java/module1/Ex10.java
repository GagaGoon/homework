package module1;

import java.math.BigInteger;

public class Ex10 {
    public static BigInteger factorial(int n) {
        if (n < 1) {
            return BigInteger.valueOf(-1);
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
