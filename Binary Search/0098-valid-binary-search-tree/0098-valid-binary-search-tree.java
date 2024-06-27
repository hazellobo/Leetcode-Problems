class Solution{
    public boolean isValidBST(TreeNode root){
        return isValidBSTHelper(node.val, Long.MIN_VALUE, Long.MAX_VALUE) 
    }

    private boolean isValidBSTHelper(TreeNode node, long minValue, long maxValue) {
        if(node == null){
            return true;
        }

        if(node.val <= minValue || node.val >= maxValue){
            return false;
        }

        return isValidBSTHelper(node.left, minValue, node.val) && isValidBSTHelper(node.right, node.val, maxValue);
    }

}