package test;

import robber.HouseRobber;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        //array of zeroes
        void raynaTest1_allZeroes() {
            int[] arr = {0,0,0};
            int result = new HouseRobber().rob(arr);
            assertEquals(result, 0);
        }

        //array of only two numbers
        void raynaTest2_twoNumbers() {
            int[] arr = {2,3};
            int result = new HouseRobber().rob(arr);
            assertEquals(result, 3);
        }

        //array of all the same number
        void raynaTest3_allSame() {
            int[] arr = {2,2,2,2};
            int result = new HouseRobber().rob(arr);
            assertEquals(result, 4);
        }

        //array of only one number
        void raynaTest4_oneNumber() {
            int[] arr = {5};
            int result = new HouseRobber().rob(arr);
            assertEquals(result, 5);
        }

        //array of standard input
        void raynaTest5_standardInput() {
            int[] arr = {2,7,3,4,5};
            int result = new HouseRobber().rob(arr);
            assertEquals(result, 12);
        }
    }

    public static void main(String[] args) {
        Test t = new HouseRobberTest().new Test();
        t.bhargavTest1_leetcodeExample();
        t.bhargavTest2_biggerExample();
        t.bhargavTest3_emptyArray();

        t.raynaTest1_allZeroes();
        t.raynaTest2_twoNumbers();
        t.raynaTest3_allSame();
        t.raynaTest4_oneNumber();
        t.raynaTest5_standardInput();
    }
}