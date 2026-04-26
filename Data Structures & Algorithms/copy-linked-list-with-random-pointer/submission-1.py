"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':

        new_head = Node(0)
        if head is None:
            return head

        temp = new_head
        curr = head
        d = {}
        
        while curr:
            temp.val = curr.val
            d[curr] = temp
            if curr.next:
                temp.next = Node(0)
            temp = temp.next
            curr = curr.next
        
        curr = head
        temp = new_head

        while curr:
            if curr.random:
                temp.random = d[curr.random]
            curr= curr.next
            temp = temp.next

            
        return new_head
            