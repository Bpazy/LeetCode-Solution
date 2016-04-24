package utils;

public class ArrayHelpers {
    public static <T> void reverse(T[] origin) {
        for (int i = 0; i < origin.length / 2; i++) {
            T temp = origin[i];
            origin[i] = origin[origin.length - i - 1];
            origin[origin.length - i - 1] = temp;
        }
    }

    public static void reverse(int[] origin) {
        for (int i = 0; i < origin.length / 2; i++) {
            int temp = origin[i];
            origin[i] = origin[origin.length - i - 1];
            origin[origin.length - i - 1] = temp;
        }
    }

    public static <T> void reverse(T[] origin, int srcPos, int destPos) {
        while (srcPos < destPos && srcPos >= 0) {
            T t = origin[srcPos];
            origin[srcPos] = origin[destPos];
            origin[destPos] = t;
            srcPos++;
            destPos--;
        }
    }

    public static void reverse(int[] origin, int srcPos, int destPos) {
        while (srcPos < destPos && srcPos >= 0) {
            int t = origin[srcPos];
            origin[srcPos] = origin[destPos];
            origin[destPos] = t;
            srcPos++;
            destPos--;
        }
    }
}
