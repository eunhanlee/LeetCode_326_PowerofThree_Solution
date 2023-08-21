package org.example;

public class followUpSolution {
    /**
     * Checks if the given integer is a power of three using logarithms.
     *
     * @param n The integer to be checked.
     * @return {@code true} if the given integer is a power of three, {@code false} otherwise.
     */
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        double logBase3 = Math.log(n) / Math.log(3);

        // Check if the logarithm is very close to an integer value
        return Math.abs(logBase3 - Math.round(logBase3)) < 1e-10;
    }
}

