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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode grouptail = dummy;
        ListNode curr = head;
        int size = 1;

        while(curr != null){
            ListNode temp = curr ; 
            int count = 0 ;
            while(temp != null && count < size){
                temp = temp.next;
                count ++;
            }
            if(count % 2 == 0){
                ListNode prev = temp ; 
                ListNode node = curr ;

                for( int i = 0 ; i < count ; i++){
                    ListNode next = node.next;
                    node.next = prev ; 
                    prev = node;
                    node = next;
                }
                grouptail.next = prev ; 
                grouptail = curr;

                curr = temp;

            }
            else{
                for(int i = 0 ; i < count ; i++){
                    grouptail = curr;
                    curr = curr.next;
                }
            }
             size ++;
        }
        return dummy.next;
    }
}