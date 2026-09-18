package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sequence.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceTest {
    private static class Cases {
        static int run(int... nums) {
            return new LongestConsecutiveSequence().longestConsecutive(nums);
        }
    }

    @Test
    void normal() {
        assertEquals(4, Cases.run(100, 4, 200, 1, 3, 2));
    }

    @Test
    void empty() {
        assertEquals(0, Cases.run());
    }

    @Test
    void duplicatesAndNegatives() {
        assertEquals(3, Cases.run(-2, -1, -1, 0, 5));
    }

    /*
    Tester: Sharif
    */

    public static void main(String[] args) {
        SharifTest.run();
        System.out.println("All tests passed");
    }

    private static class SharifTest {

        // Sharif
        static void run() {
            LongestConsecutiveSequence s = new LongestConsecutiveSequence();

            assertEquals(4, s.longestConsecutive(new int[]{1, 2, 3, 4}));
            assertEquals(4, s.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
            assertEquals(9, s.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
            assertEquals(0, s.longestConsecutive(new int[]{}));
            assertEquals(1, s.longestConsecutive(new int[]{5}));
            assertEquals(1, s.longestConsecutive(new int[]{1, 1, 1}));
            assertEquals(1, s.longestConsecutive(new int[]{10, 30, 20}));
            assertEquals(4, s.longestConsecutive(new int[]{-2, -1, 0, 1}));
        }
    }
}
