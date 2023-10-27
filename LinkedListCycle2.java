public class LinkedListCycle2 {
    
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> al=new ArrayList<>(); 
        
        while(head!=null){
            for(ListNode i:al){
                if(head.equals(i)){
                    return i;
                }
            }
            al.add(head);
            head=head.next;

        }
        return null;
        
    }
}
