public class RemoveDuplicateFromSortedList {
    
}
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode h=head;
        while(h.next!=null){
            if(h.val==h.next.val){
                h.next=h.next.next;
            }else
            h=h.next;
            if(h==null){
                break;
            }

        }
        return head;
        
    }
}