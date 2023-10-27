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
    public ListNode swapPairs(ListNode head) {
        ListNode newHead=head;
        if(head!=null&&head.next!=null)
        newHead=head;
        else return head;
        while(head!=null&&head.next!=null){
            int t=head.val;
            head.val=head.next.val;
            head.next.val=t;
            head=head.next.next;
        }
        return newHead;
        
    }
}