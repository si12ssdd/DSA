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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;

        // Find length
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int pos2 = n - k + 1; // kth node from end (position from start)

        ListNode first = head;
        ListNode second = head;

        // Move to kth node from start
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Move to kth node from end
        for (int i = 1; i < pos2; i++) {
            second = second.next;
        }

        // Swap values
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        return head;
    }
}