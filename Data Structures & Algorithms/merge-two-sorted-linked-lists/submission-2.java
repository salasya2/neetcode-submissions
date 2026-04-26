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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode res=list1;
        int len1=0,len2=0;
        while(head1!=null)
        {
            len1++;
            head1=head1.next;
        }
        while(head2!=null)
        {
            len2++;
            head2=head2.next;
        }
        if(len1<len2)
        {
            head1=list2;
            head2=list1;
            res=list2;
        }
        else
        {
            head1=list1;
            head2=list2;
        }
        ListNode prev=null;
        while(head2!=null && head1!=null)
        {
            if(head1.val>=head2.val)
            {
                ListNode temp=new ListNode(head2.val);
                if(prev==null)
                {
                    
                    temp.next=head1;
                    res=temp;
                }
                else
                {
                    
                    prev.next=temp;
                    temp.next=head1;
                    System.out.println(temp.val);
                }
                prev=temp;
                head2=head2.next;
            }

            else 
            {
                prev=head1;
                head1=head1.next; 
            }
            
        }
        while(head2!=null)
        {
            ListNode temp=new ListNode(head2.val);
            prev.next=temp;            
            head2=head2.next;
            prev=temp;
        }
        return res;
    }
}