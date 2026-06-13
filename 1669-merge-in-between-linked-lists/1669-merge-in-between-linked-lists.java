/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode before = list1;
        ListNode after = list1;

        // Find node before index a
        for (int i = 0; i < a - 1; i++) {
            before = before.next;
        }

        // Find node after index b
        after = before;
        for (int i = 0; i < b - a + 2; i++) {
            after = after.next;
        }

        // Find tail of list2
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Connect
        before.next = list2;
        tail.next = after;

        return list1;
    }
}