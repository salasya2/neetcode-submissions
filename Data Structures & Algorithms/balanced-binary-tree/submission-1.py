# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxHeight(self,root):

        if root == None:
            return 0
        res = 0
        stack = [[root,1]]
        while stack:
            node,depth = stack.pop()

            if node:
                res = max(depth,res)
                stack.append([node.left,depth+1])
                stack.append([node.right,depth + 1])
        return res
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root == None:
            return True
        isBalanced = True
        stack = [root]

        while stack:
            node = stack.pop()
            if node:
                if abs(self.maxHeight(node.left)-self.maxHeight(node.right))>1:
                    isBalanced = False
                    break
                stack.append(node.left)
                stack.append(node.right)

        return isBalanced


        