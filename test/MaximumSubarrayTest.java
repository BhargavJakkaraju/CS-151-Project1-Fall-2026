package test;

import subarray.MaximumSubarray;

public class MaximumSubarrayTest {

    private class Test {
        void bhargavTest1_mixedArray() {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            int res = new MaximumSubarray().maxSubArray(nums);
            System.out.println(res == 6);
        }

        void bhargavTest2_singleElement() {
            int[] nums = {5};
            int res = new MaximumSubarray().maxSubArray(nums);
            System.out.println(res == 5);
        }

        void bhargavTest3_allNegative() {
            int[] nums = {-3,-1,-4,-2};
            int res = new MaximumSubarray().maxSubArray(nums);
            System.out.println(res == -1);
        }

    }

    public static void main(String[] args) {
        Test t = new MaximumSubarrayTest().new Test();
        t.bhargavTest1_mixedArray();
        t.bhargavTest2_singleElement();
        t.bhargavTest3_allNegative();

    }
}