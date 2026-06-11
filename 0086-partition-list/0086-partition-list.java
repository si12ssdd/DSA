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
    public ListNode partition(ListNode head, int x) {
        ListNode smalldummy = new ListNode(0);
        ListNode smalltail = smalldummy;
        ListNode largedummy = new ListNode(0);
        ListNode largetail = largedummy;

        ListNode curr = head;

        while(curr != null ){
            if(curr.val < x){
                smalltail.next = curr;
                smalltail = smalltail.next;
            }
            else{
                largetail.next = curr;
                largetail = largetail.next;
            }
            curr = curr.next;

        }
        largetail.next = null ;// main pakad
        smalltail.next = largedummy.next;

        return smalldummy.next;
    }
}