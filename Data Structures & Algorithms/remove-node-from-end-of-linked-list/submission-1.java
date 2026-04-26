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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next==null && n==1) return null;
            int i=0;
            ListNode one=head;
            ListNode two=head;
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            ListNode res=dummy;

            while(one!=null)
            {
                if(i!=n)
                {
                    one=one.next;
                    i++;
                }
                else if(i==n-1)
                {
                    dummy=dummy.next;
                    
                }
                else
                {
                    one=one.next;
                    two=two.next;
                    dummy=dummy.next;
                }

            }
            dummy.next=two.next;
            return res.next;
    }
}
