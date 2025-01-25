package module2;

import java.lang.CharSequence;
import java.lang.reflect.Array;

public class Ex9 {
    public static class AsciiCharSequence implements CharSequence {
        byte[] bytes;

        AsciiCharSequence(byte[] bytes) {
            this.bytes = bytes;
        }

        @Override
        public int length() {
            return Array.getLength(bytes);
        }

        @Override
        public char charAt(int index) {
            return (char) bytes[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] bytes = new byte[end - start];
            for (int i = start; i < end; i++) {
                bytes[i - start] = this.bytes[i];
            }
            return new AsciiCharSequence(bytes);
        }

        @Override
        public String toString() {
            return new String(bytes);
        }
    }

    public static void main(String[] args) {
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(
                new byte[]{65, 66, 67, 68, 69, 70, /*перенос строки*/10, 97, 98, 99, 100, 101, 102});
        System.out.println(asciiCharSequence);
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(5));
        System.out.println(asciiCharSequence.subSequence(7,13));
    }
}
