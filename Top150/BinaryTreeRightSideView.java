import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i =0;i<size;i++){
                TreeNode cur = q.poll();
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);

                if(i==size-1) res.add(cur.val);
            }
        }
        return res;
    }
}
