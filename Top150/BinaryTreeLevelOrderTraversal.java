class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> cur = new ArrayList<>();
            int size = q.size();

            for(int i =0;i<size;i++){
                TreeNode curNode = q.poll();
                cur.add(curNode.val);

                if(curNode.left!=null) q.add(curNode.left);
                if(curNode.right!=null) q.add(curNode.right);
            }

            res.add(cur);
        }
        return res;
    }
}
