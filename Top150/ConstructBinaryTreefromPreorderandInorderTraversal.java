class Solution {
    private int[] preorder, inorder;
    private HashMap<Integer,Integer> idx;
    
    public TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        this.inorder = inorder;
        idx = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            idx.put(inorder[i],i);
        }
        return build(0,preorder.length -1, 0, inorder.length -1);
    }

    private TreeNode build(int preL,int preR,int inL,int inR){
        if(preL > preR) return null;

        int rootVal = preorder[preL];
        TreeNode root = new TreeNode(rootVal);

        int k = idx.get(rootVal);
        int leftSize = k - inL;

        root.left = build(preL+1,preL + leftSize, inL, k-1);
        root.right = build(preL + leftSize+1,preR,k+1,inR);
        return root;
    }
}
