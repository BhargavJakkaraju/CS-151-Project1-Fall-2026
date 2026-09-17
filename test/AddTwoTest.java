package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import add.AddTwo;
import add.ListNode;

public class AddTwoTest {
    private static class Cases {
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

    @Test
    void normal() {
        assertTrue(Cases.matches(
            new AddTwo().addTwoNumbers(Cases.list(2, 4, 3), Cases.list(5, 6, 4)),
            7, 0, 8));
    }

    @Test
    void zeroes() {
        assertTrue(Cases.matches(
            new AddTwo().addTwoNumbers(Cases.list(0), Cases.list(0)),
            0));
    }

    @Test
    void extraCarry() {
        assertTrue(Cases.matches(
            new AddTwo().addTwoNumbers(Cases.list(9, 9), Cases.list(1)),
            0, 0, 1));
    }
}