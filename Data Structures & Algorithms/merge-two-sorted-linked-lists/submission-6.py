# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        head1 = list1
        head2 = list2
        list_fin,head= None,None
        if head1 is None and head2 is None:
            return None
        if head1 is None:

            list_fin = ListNode(head2.val)
            head = list_fin
            head2 = head2.next
        elif head2 is None:
            list_fin = ListNode(head1.val)
            head = list_fin
            head1 = head1.next
        else:
            
            if head1.val < head2.val:
                list_fin = ListNode(head1.val)
                head = list_fin
                head1 = head1.next

            else:
                list_fin = ListNode(head2.val)
                head = list_fin
                head2 = head2.next

        while head1 and head2:

            if head1.val < head2.val:
                head.next = head1
                head1 = head1.next
                head = head.next
            else:
                head.next = head2
                head2 = head2.next
                head = head.next

        while head1:
            head.next = head1
            head1 = head1.next
            head = head.next

        while head2:
            head.next = head2
            head2 = head2.next
            head = head.next
        return list_fin
