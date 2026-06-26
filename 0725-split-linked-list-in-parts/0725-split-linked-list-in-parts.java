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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head ; 
        int l = 0 ; 
        while(curr != null){
            l++;
            curr = curr.next;

        }

        int max = l / k;
        int extra = l%k;

        ListNode [] result = new ListNode[k];
         curr = head;
        ListNode prev = null;

        for(int i = 0 ; i<k; i++){
            result[i] = curr;
            for(int count = 1 ; count <= max + (extra > 0 ? 1 : 0); count ++){
                prev = curr; 
                if (curr != null){
                    curr = curr.next;
                }

            }
            if(prev != null){
            prev.next = null;
            }
            extra--;
        }

        return result;
      

    }
}