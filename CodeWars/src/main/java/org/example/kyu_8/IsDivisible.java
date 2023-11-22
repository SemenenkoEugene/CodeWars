package org.example.kyu_8;

public class IsDivisible {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    public static boolean isDivisible(int n, int... args) {
        for (int arg : args) {
            if (n % arg != 0) {
                return false;
            }
        }
        return true;
    }
}
