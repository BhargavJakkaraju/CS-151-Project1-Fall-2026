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
        }
    }
}
