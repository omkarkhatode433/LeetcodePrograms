import java.util.ArrayList;

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
        ArrayList<Integer> al=new ArrayList<>();
        if(head==null){
            return head;
        }
        int v=900;
        ListNode s=null;
        ListNode s2=s;
        while(head!=null&&head.next!=null){
            if(head.val!=head.next.val&&head.val!=v){
                al.add(head.val);               
            }
            v=head.val;
            head=head.next;
        }
        if(head.val!=v){
            al.add(head.val);
        }
        for(int i:al){
            if(s==null){
                s=new ListNode(i);
                s2=s;
            }else{
                s.next=new ListNode(i);
                s=s.next;
            }
        }
        al=null;
        // System.out.print(al);
        return s2;
        
        
    }
}