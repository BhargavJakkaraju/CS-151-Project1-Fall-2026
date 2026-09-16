package test;

import robber.HouseRobber;

public class HouseRobberTest {

    private class Test {
        void bhargavTest1_leetcodeExample() {
            int[] nums = {1,2,3,1};
            int res = new HouseRobber().rob(nums);
            System.out.println(res == 4);
        }

        void bhargavTest2_biggerExample() {
            int[] nums = {2,7,9,3,1};
            int res = new HouseRobber().rob(nums);
            System.out.println(res == 12);
        }

        void bhargavTest3_emptyArray() {
            int[] nums = {};
            int res = new HouseRobber().rob(nums);
            System.out.println(res == 0);
        }


    }

    public static void main(String[] args) {
        Test t = new HouseRobberTest().new Test();
        t.bhargavTest1_leetcodeExample();
        t.bhargavTest2_biggerExample();
        t.bhargavTest3_emptyArray();
    }
}