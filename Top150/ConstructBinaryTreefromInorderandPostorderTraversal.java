class Solution {
    private int[] inorder,postorder;
    private HashMap<Integer,Integer> idx;

    public TreeNode buildTree(int[] inorder,int[] postorder){
        this.inorder = inorder;
        this.postorder = postorder;
        idx = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            idx.put(inorder[i],i);
        }
        return build(0,inorder.length-1,0,postorder.length-1);
    }

    private TreeNode build(int inL,int inR,int postL,int postR){
        if(postL>postR) return null;

        int rootVal = postorder[postR];
        TreeNode root = new TreeNode(rootVal);

        int k = idx.get(rootVal);
        int leftSize = k - inL;

        root.left = build(inL,k-1,postL,postL+leftSize-1);
        root.right = build(k+1,inR,postL+leftSize,postR-1);
        return root;
    }
}
