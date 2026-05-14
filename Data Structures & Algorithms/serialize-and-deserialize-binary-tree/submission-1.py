# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Codec:
    
    # Encodes a tree to a single string.
    def serialize(self, root: Optional[TreeNode]) -> str:
        res = ""

        def dfs(root):
            nonlocal res
            if root:
                res+=str(root.val)
            if not root:
                res+='N'
                return
            
            dfs(root.left)
            dfs(root.right)

        dfs(root)
        return res


            

        
    # Decodes your encoded data to tree.
    def deserialize(self, data: str) -> Optional[TreeNode]:
        i = 0
        
        # def dfs(data):
        #     nonlocal i
        #     if i > len(data) - 1:
        #         return None
        #     root = None
        #     if data[i] != 'N':
        #         root = TreeNode(data[i])
        #         i+=1
        #     else:
        #         i+=1
        #         return root

            
        #     root.left = dfs(data[i:])
        #     root.right = dfs(data[i:])
        #     return root
        # root = dfs(data)

        return root