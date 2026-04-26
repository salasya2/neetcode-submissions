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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null ) return ;
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }


        ListNode prev=null;
        ListNode next=null;
        ListNode curr=slow.next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        slow.next=null;

        ListNode temp=head;

        while(prev!=null)
        {
            ListNode tmp1=temp.next;
            ListNode tmp2=prev.next;
            temp.next=prev;
            prev.next=tmp1;
            prev=tmp2;
            temp=tmp1;
        }
        

    }
}
