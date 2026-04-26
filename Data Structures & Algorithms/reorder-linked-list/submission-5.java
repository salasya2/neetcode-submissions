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
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next ==null) return head;

        ListNode prev=null;
        ListNode next=head.next;

        while(next!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head.next==null) return;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode res=dummy; 
        ListNode odd=head;
        ListNode even=head.next;

        while(even!=null && even.next!=null)
        {
            odd=odd.next;
            even=even.next.next;
        }

        even=odd.next;
        odd.next=null;
        even=reverse(even);


        while(head!=null && even!=null)
        {
            dummy.next=head;
            head=head.next;
            dummy=dummy.next;
            dummy.next=even;
            even=even.next;
            dummy=dummy.next;
        }
        if(head!=null)
        {
            dummy.next=head;
            head=head.next;
            dummy=dummy.next;
        }
        if(even!=null)
        {
            dummy.next=even;
            even=even.next;
            dummy=dummy.next;
        }
        return;

    }
}
