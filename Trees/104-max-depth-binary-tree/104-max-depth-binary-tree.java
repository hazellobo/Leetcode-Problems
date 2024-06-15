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
    //1. Recursive DFS
    // public int maxDepth(TreeNode root) {
    //     if(root == null)
    //         return 0;
    //     return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    // }

    //2. Iterative DFS
    // public int maxDepth(TreeNode root) {

    //     if(root == null)
    //         return 0;

    //     int maxDepth = 1;

    //     Stack<TreeNode> nodes = new Stack<>();
    //     Stack<Integer> depths = new Stack<>();

    //     nodes.push(root);
    //     depths.push(1);

    //     while(!nodes.empty()){
    //         TreeNode curr = nodes.pop();
    //         int depth = depths.pop();

    //         if (curr.left == null && curr.right == null) {
    //             maxDepth = Math.max(maxDepth, depth);
    //         } 

    //          if (curr.right != null) {
    //             nodes.push(curr.right);
    //             depths.push(depth + 1);
    //         } 

    //         if (curr.left != null) {
    //             nodes.push(curr.left);
    //             depths.push(depth + 1);
    //         }
    //     }
    //     return maxDepth;
    // }

    //3. BFS
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int maxDepth = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            maxDepth++;
            while (size-- > 0) {
                TreeNode node = nodes.poll();
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
        }
        return maxDepth;
    }
}