import java.util.*;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null) return false;
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        Deque<Integer> sumStack = new ArrayDeque();
        nodeStack.push(root);
        sumStack.push(targetSum - root.val);
        while(!nodeStack.isEmpty()){
            TreeNode cur = nodeStack.pop();
            int remain = sumStack.pop();
            if(cur.left == null && cur.right == null && remain == 0) return true;
            if(cur.right != null){
                nodeStack.push(cur.right);
                sumStack.push(remain - cur.right.val);
            }
            if(cur.left != null){
                nodeStack.push(cur.left);
                sumStack.push(remain - cur.left.val);
            }
        }
        return false;
        
    }
}
