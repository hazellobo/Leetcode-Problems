class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> dfstack = new Stack<>();
        while (root != null || !dfstack.isEmpty()) {
            while(root != null){
                dfstack.push(root);
                root = root.left;
            }

            root = dfstack.pop();
            k--;

            if(k==0)
                break;
            root = root.right;
        }
        return root.val;
    }
}