package module1;

public class Ex9 {
    public static boolean isPowerOfTwo(int value) {
        Math.abs(value);

        //Первый способ


        if (Integer.bitCount(value) == 1) {
            return true;
        } else {
            return false;
        }


        //Второй способ

        /*
        if (value == 0) {
            return false;
        }
        int a = value & (value - 1);
        if (a == 0) {
            return true;
        } else {
            return false;
        }
        */

        //Третий способ

        /*
        boolean res = true;
        if (value == 0)
            res = false;
        while (value > 1) {
            if ((value % 2) != 0) {
                res = false;
                break;
            }
            value /= 2;
        }
        return res;
        */
    }
}
