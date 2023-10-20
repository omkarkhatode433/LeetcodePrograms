public class AddTwoNumbers {
    public static void main(String[] args) {
        
    }
    
}

// * Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  /*
 long f=0,s=0,c=1,z=1;
       long i=l1.val;
       boolean st=true;
       //System.out.print(i);
        
       while(l1!=null){
           if(l1.val==0&&f==0){
               z=z*10;
           }
           long t=f;
           f=f*10+l1.val;
           System.out.println(f);
           l1=l1.next;
       }
       long rev=0;
       while(f>0){
           rev=rev*10+f%10;
           f=f/10;

       }
       f=rev*z;
       z=1;
       System.out.println(f);
      
       while(l2!=null){
            if(l2.val==0&&s==0){
                z=z*10;
            }
             s=s*10+l2.val;
             l2=l2.next;
       }
        rev=0;
       while(s>0){
           rev=rev*10+s%10;
           s=s/10;

       }
       s=rev*z;
       System.out.println(s);
       c=f+s;
        System.out.println(c);
      
       
       ListNode node=null;
      // c=c/10;
       ListNode rr=new ListNode(0);

       while(c>0){
           if(node==null){
               ListNode node2;
               long k=c%10;
               int k1=Math.toIntExact(k);
              
                node2=new ListNode(k1);
               System.out.println(k1);
               node=node2;
               rr=node;
           }else{
               long k=c%10;
               int k1=Math.toIntExact(k);
            ListNode   node3=new ListNode(k1);
            node.next=node3;
           node =node3;

		//node.next=node2;

		
           }
           c=c/10;

       }
       
        return rr;
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int f=0,s=0,c=0;
        ListNode node=null;
        ListNode tail=new ListNode(0);
       ListNode rr=new ListNode(0);
        while(l1!=null||l2!=null){
            int fst=0,sec=0;
            s=0;
            if(l1==null){
                fst=0;
            }else{
                fst=l1.val;
            }
            if(l2==null){
                sec=0;
            }else{
                sec=l2.val;
            }
            s=fst+sec;
            if(node==null){
                node=new ListNode((s+c)%10);
                tail=node;
            }else{
                ListNode newNode=new ListNode((s+c)%10);
                tail.next=newNode;
                tail=newNode;
            }
            c=(s+c)/10;
            if(l1==null||l1.next==null){
                l1=null;
                
            }else{
                l1=l1.next;
            }
            if(l2==null||l2.next==null){
                l2=null;
                
            }else{
                 l2=l2.next;
            }
            
           

        }
        if(c>0){
            ListNode newNode=new ListNode(c);
            tail.next=newNode;
        }
       
return node;
       
    }
     public static void add(ListNode node,int data){
            if(node==null){
                ListNode newNode=new ListNode(data);
                node=newNode;
                node.next=null;
            }else{
                ListNode newNode=new ListNode(data);
                ListNode newNode2=node;
                while(newNode2.next!=null){
                    newNode2=newNode2.next;
                }
                newNode2.next=newNode;
                newNode2.next=null;

            }
        }

}
