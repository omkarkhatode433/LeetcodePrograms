public class MergeKSortedLists {
    
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
    public ListNode mergeKLists(ListNode[] lists) {
        // if(lists.length==0){
        //     return null;
        // }
        // ListNode head=null;
        // ListNode h=new ListNode();
        // boolean f=false;
        // while(!f){
        //     int i=0,min=214748364;
        //     f=true;
        //     int idx=0;
        //     while(i<lists.length){
        //        if(lists[i]!=null){
        //             if(min>lists[i].val){
        //                 min=lists[i].val;
        //                 idx=i;
        //             }
        //             f=false;
        //        }
        //         i++;
        //     }
           
        //     if(f){
        //         continue;
        //     }
        //     if(lists[idx]!=null)
        //         lists[idx]=lists[idx].next;
        //     if(head==null){
        //         head=new ListNode(min);
        //         h=head;
        //     }else{
        //         h.next=new ListNode(min);
        //         h=h.next;
        //     }
        // }
        // return head;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                al.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        Collections.sort(al);
        ListNode head=null;
        ListNode h=null;
        for(int i=0;i<al.size();i++){
            ListNode n=new ListNode(al.get(i));
            if(head==null){
                head=n;
                h=head;
            }else{
                h.next=n;
                h=h.next;

            }

        }
        return head;
        
    }
}
