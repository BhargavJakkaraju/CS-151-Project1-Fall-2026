package test;

import sequence.LongestConsecutiveSequence;

/*
Tester: Sharif
*/

class LongestConsecutiveSequenceTest {
    public static void main(String[] args) {
        // Sharif
        int[] nums = {1, 2, 3, 4};
        int res = new LongestConsecutiveSequence().longestConsecutive(nums);
        System.out.println(res == 4);
    }
}
