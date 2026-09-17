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
}