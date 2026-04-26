# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

def mergeTwoLists(head1,head2):

    dummy = ListNode(0)

    temp = dummy

    while head1 and head2:

        if head1.val< head2.val:
            temp.next = ListNode(head1.val)
            temp = temp.next
            head1 = head1.next
        else:
            temp.next = ListNode(head2.val)
            temp = temp.next
            head2 = head2.next

    while head1:
        temp.next = ListNode(head1.val)
        temp = temp.next
        head1 = head1.next
    while head2:
        temp.next = ListNode(head2.val)
        temp = temp.next
        head2 = head2.next
    return dummy.next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
       
        if len(lists) == 0:
            return None
        if lists[0] == None:
            return None
        for i in range(1,len(lists)):
            lists[i] = mergeTwoLists(lists[i-1],lists[i])
        print(lists)
        return lists[len(lists)-1]
        