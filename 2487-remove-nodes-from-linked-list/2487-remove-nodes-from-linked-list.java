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
    public ListNode removeNodes(ListNode head) {

        // Reverse the linked list
        head = reverse(head);

        ListNode curr = head;
        int max = curr.val;

        while (curr != null && curr.next != null) {

            if (curr.next.val < max) {
                // Remove the next node
                curr.next = curr.next.next;
            } else {
                // Update maximum and move forward
                curr = curr.next;
                max = curr.val;
            }
        }

        // Reverse again to restore order
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}