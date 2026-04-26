/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public List<List<Integer>> res= new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        order(root,0);

        return res;
    }
    public void order(TreeNode root, int level)
    {
        if(root==null) return;

        if(res.size()==level){
            res.add(new ArrayList(Arrays.asList(root.val)));
        }
        else
        {
            res.get(level).add(root.val);
        }
        order(root.left,level+1);
        order(root.right,level+1);
    }
}
