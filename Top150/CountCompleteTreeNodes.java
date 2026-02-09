class Solution {
    public int countNodes(TreeNode root){
        if(root == null) return 0;

        int hl = leftHeight(root.left);
        int hr = leftHeight(root.right);

        if(hl == hr){
            return (1 << hl) + countNodes(root.right);
        }else{
            return (1<< hr) + countNodes(root.left);
        }
    }

    private int leftHeight(TreeNode node){
        int h = 0;
        while(node != null){
            h++;
            node = node.left;
        }
        return h;
    }
}
