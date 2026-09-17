package test;

import sequence.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceTest {
    private static class Test {
        static void run() {
            LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

            // Min Myat Thu's tests
            System.out.println("Normal: " +
                (solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}) == 4));
            System.out.println("Empty: " +
                (solution.longestConsecutive(new int[]{}) == 0));
            System.out.println("Duplicates and negatives: " +
                (solution.longestConsecutive(new int[]{-2, -1, -1, 0, 5}) == 3));
        }
    }

    public static void main(String[] args) {
        Test.run();
    }
}