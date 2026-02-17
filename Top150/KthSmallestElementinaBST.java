class Solution {
    private int ans;
    private int count;

    public int kthSmallest(TreeNode root, int k){
        count = k;
        inorder(root);
        return ans;
    }

    private void inorder(TreeNode node){
        if(node==null) return;

        inorder(node.left);

        count--;
        if(count==0) {
            ans = node.val;
            return;
        }

        inorder(node.right);
    }
}
