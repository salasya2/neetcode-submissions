# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        if not root:
            return True
        
        stack = [[root,-float("inf"),float("inf")]]
        # print(stack)
        while stack:

            node ,minLimit,maxLimit = stack.pop()
            if node:
                if node.val <= minLimit or node.val >= maxLimit:
                    return False
                
                stack.append([node.left, minLimit, min(maxLimit, node.val)])
                stack.append([node.right, max(node.val,minLimit),maxLimit])
            print(stack)
        return True

        