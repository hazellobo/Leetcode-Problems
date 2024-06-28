class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        
        // helps retrieve the index from inorder array in O(1) time
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        return buildTreeHelper(preorder, inorderMap, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, Map<Integer, Integer> inorderMap, int preStart, int inStart, int inEnd) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = inorderMap.get(preorder[preStart]);

        root.left = buildTreeHelper(preorder, inorderMap, preStart + 1, inStart, inIndex - 1);
        root.right = buildTreeHelper(preorder, inorderMap, preStart + inIndex - inStart + 1, inIndex + 1, inEnd);

        return root;
    }
}
