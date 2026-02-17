class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> cur = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curNode = q.poll();

                if(leftToRight){
                    cur.addLast(curNode.val);
                }else{
                    cur.addFirst(curNode.val);
                }

                if(curNode.left!=null) q.add(curNode.left);
                if(curNode.right!=null) q.add(curNode.right);
            }
            res.add(cur);
            leftToRight = !leftToRight;
        }
        return res;
    }
}
