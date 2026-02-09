import java.util.*;

class Solution {
    public int sumNumbers(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        Deque<Integer> intStack = new ArrayDeque<>();
        nodeStack.push(root);
        intStack.push(0);
        while(!nodeStack.isEmpty()){
            TreeNode cur = nodeStack.pop();
            int remain = intStack.pop();
            if(cur.left==null && cur.right==null){
                sum += remain*10 + cur.val;
                continue;
            }
            if(cur.right!=null){
                nodeStack.push(cur.right);
                intStack.push(remain*10+cur.val);
            }
            if(cur.left!=null){
                nodeStack.push(cur.left);
                intStack.push(remain*10+cur.val);
            }
        }
        return sum;
    }
}
