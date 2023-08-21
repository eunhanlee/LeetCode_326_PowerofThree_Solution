import org.example.Solution;
import org.example.followUpSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void SolutionTest() {
//        Solution solution = new Solution();
        followUpSolution solution = new followUpSolution();

        assertTrue(Solution.isPowerOfThree(1));
        assertFalse(solution.isPowerOfThree(-1));
        assertTrue(solution.isPowerOfThree(3));
        assertTrue(solution.isPowerOfThree(9));
        assertTrue(solution.isPowerOfThree(27));
        assertTrue(solution.isPowerOfThree(81));
        assertFalse(solution.isPowerOfThree(-81));
        assertTrue(solution.isPowerOfThree(243));
        assertTrue(solution.isPowerOfThree(729));
        assertTrue(solution.isPowerOfThree(19683));
        assertTrue(solution.isPowerOfThree(59049));
        assertFalse(solution.isPowerOfThree(-59049));
        assertTrue(solution.isPowerOfThree(387420489));
        assertFalse(solution.isPowerOfThree(-387420489));

        System.out.println("All test cases passed.");
    }
}
