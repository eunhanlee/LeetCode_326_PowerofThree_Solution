package org.example;

public class Solution {
    /**
     * Checks if the given integer is a power of three.
     *
     * @param n The integer to be checked.
     * @return {@code true} if the given integer is a power of three, {@code false} otherwise.
     */
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
