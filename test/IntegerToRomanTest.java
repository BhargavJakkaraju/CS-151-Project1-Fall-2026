package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Roman.Solution;

/*
Tester: Sharif
*/

public class IntegerToRomanTest {

    public static void main(String[] args) {
        Test.run();
        System.out.println("All tests passed");
    }

    private static class Test {

        // Sharif
        static void run() {
            Solution s = new Solution();

            assertEquals("III", s.intToRoman(3));
            assertEquals("LVIII", s.intToRoman(58));
            assertEquals("MCMXCIV", s.intToRoman(1994));
            assertEquals("I", s.intToRoman(1));
            assertEquals("MMMCMXCIX", s.intToRoman(3999));
            assertEquals("IV", s.intToRoman(4));
            assertEquals("IX", s.intToRoman(9));
            assertEquals("M", s.intToRoman(1000));

            //rayna tests

            //test 1 - testing for 0
            assertEquals("", s.intToRoman(0));

            //test 2 - testing for negative numbers
            assertEquals("", s.intToRoman(-3));

            //tests 3-5 = testing for happy path cases 32, 10, and 450
            assertEquals("XXXII", s.intToRoman(32));
            assertEquals("X", s.intToRoman(10));
            assertEquals("CDL", s.intToRoman(450));
        }
    }
}
