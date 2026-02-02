import java.util.*;

class Solution {
    public int evalRPN(String[] tokens){
        Deque<Integer> stack = new ArrayDeque<>();

        for(String t : tokens){
            if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                int r ;
                if(t.equals("+")) r = a+b;
                else if(t.equals("-")) r = a-b;
                else if(t.equals("*")) r =a*b;
                else r = a/b;

                stack.push(r);
            }else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
