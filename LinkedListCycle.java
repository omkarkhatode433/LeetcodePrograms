public class LinkedListCycle {
    
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
    static ArrayList<ListNode> al;
    public boolean hasCycle(ListNode head) {
        al=new ArrayList<>();
        return isPresent(head);
        
    }
    public static boolean isPresent(ListNode head){
        if(head==null){
            return false;
        }
        
        while(head!=null){
            for(ListNode i:al){
                if(head.equals(i)){
                    return true;
                }
            }
            al.add(head);
            head=head.next;

        }
        return false;


    }
}
