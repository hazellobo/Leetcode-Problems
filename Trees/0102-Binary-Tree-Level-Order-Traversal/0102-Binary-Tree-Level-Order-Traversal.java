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

    //BFS Traversal
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> nodes = new LinkedList<>();

        if(root==null){
            return result;
        }
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int levels = nodes.size();
            List<Integer> subLevels = new ArrayList<Integer>();
            for(int i = 0; i < levels; i++){
                if(nodes.peek().left!=null){
                    nodes.add(nodes.peek().left);
                }
                if(nodes.peek().right!=null){
                    nodes.add(nodes.peek().right);
                }
                subLevels.add(nodes.remove().val);
            }
            result.add(subLevels);
        }
        return result;
    }
}