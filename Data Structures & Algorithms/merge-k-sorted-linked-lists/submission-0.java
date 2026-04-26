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

    public ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.val<head2.val)
            {
                head.next=head1;
                head1=head1.next;
            }
            else 
            {
                head.next=head2;
                head2=head2.next;
            }
            head=head.next;
        }
        if(head1!=null){
            head.next=head1;
            head=head.next;
        }
        if(head2!=null)
        {
            head.next=head2;
            
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0)
          return null;
        ListNode head=lists[0];
        if(head==null) return null;

        for(int i=1;i<n;i++)
        {
            // ListNode temp=head;
            // System.out.println("Iteration : "+ i);
            // while(temp!=null)
            // {
            //     System.out.print(temp.val+" ");
            //     temp=temp.next;
            // }
            // System.out.println("\nAfter merge");
            head=merge(head,lists[i]);
            ListNode temp=head;
            System.out.println("Iteration : "+ i);
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println("");
        }
        
        return head;
    }
}
