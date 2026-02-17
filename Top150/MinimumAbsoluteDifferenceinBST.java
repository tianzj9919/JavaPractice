import java.util.Queue;

class Solution {
    private Integer pre = null;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root){
        inorder(root);
        return min;
    }

    private void inorder(TreeNode node){
        if(node==null) return;

        inorder(node.left);

        if(pre != null){
            min = Math.min(min,node.val-pre);
        }
        pre = node.val;

        inorder(node.right);
    }
}
