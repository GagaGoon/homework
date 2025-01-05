package module1;

public class Ex4 {
    public static boolean doubleExpression(double a, double b, double c){
        return Math.abs(a + b-c) <= Math.abs(0.0001);
    }
}
