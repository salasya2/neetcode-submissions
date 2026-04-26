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

        while(fast.next!=null && fast.next.next!=null)
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
        fast=temp.next;

        while(temp!=null && prev!=null)
        {
            fast=temp.next;
            curr=prev.next;
            temp.next=prev;
            prev.next=fast;
            prev=curr;
            if(fast==null) break;
            temp=fast;
        }
        if(prev!=null)
        {
            temp.next.next=prev;
        }

    }
}
