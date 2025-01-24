package module2;

public class Ex4 {
    public static class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(im) + Double.hashCode(re);
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
        }
    }
}