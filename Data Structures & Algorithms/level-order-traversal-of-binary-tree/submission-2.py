# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        stack = [[root,1]]
        res = []
        while stack:
            node,depth = stack.pop()

            if node:
                if len(res) < depth:
                    res.append([node.val])
                else:
                    res[depth-1].append(node.val)
                stack.append([node.right,depth+1])
                stack.append([node.left,depth+1])

        return res    
            

        