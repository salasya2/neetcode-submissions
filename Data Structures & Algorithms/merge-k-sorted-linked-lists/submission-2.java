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
        if(lists.length==0) return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);
        for(ListNode  head : lists)
        {
            pq.offer(head);
        }
        ListNode res=new ListNode(0);
        ListNode dummy=res;

        while(!pq.isEmpty())
        {
            ListNode node=pq.poll();

            dummy.next=node;
            node=node.next;
            if(node!=null) pq.offer(node);
            dummy=dummy.next;
        }
        return res.next;
    }
}
