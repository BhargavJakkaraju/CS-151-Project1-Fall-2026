package test;

import add.AddTwo;
import add.ListNode;

public class AddTwoTest {
    private static class Test {
        static void run() {
            AddTwo solution = new AddTwo();

            // Min Myat Thu's tests
            System.out.println("Normal: " + matches(
                solution.addTwoNumbers(list(2, 4, 3), list(5, 6, 4)), 7, 0, 8));
            System.out.println("Zeroes: " + matches(
                solution.addTwoNumbers(list(0), list(0)), 0));
            System.out.println("Extra carry: " + matches(
                solution.addTwoNumbers(list(9, 9), list(1)), 0, 0, 1));
        }

        static ListNode list(int... digits) {
            ListNode head = new ListNode(digits[0]);
            ListNode current = head;
            for (int i = 1; i < digits.length; i++) {
                current.next = new ListNode(digits[i]);
                current = current.next;
            }
            return head;
        }

        static boolean matches(ListNode node, int... expected) {
            for (int digit : expected) {
                if (node == null || node.val != digit) return false;
                node = node.next;
            }
            return node == null;
        }
    }

    public static void main(String[] args) {
        Test.run();
    }
}