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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode dummyodd = new ListNode(0);
        ListNode dummyeven = new ListNode(0);

        ListNode oddtail = dummyodd;
        ListNode eventail = dummyeven;

        ListNode curr = head;
        int pos = 1; 

        while(curr != null){
            if(pos % 2 == 1){
                oddtail.next = new ListNode(curr.val);
                oddtail = oddtail.next;
            }
            else{
                eventail.next = new ListNode(curr.val);
                eventail = eventail.next;
            }
            curr = curr.next;
            pos ++;

        }
        oddtail.next = dummyeven.next;
        return dummyodd.next;        
    }
}