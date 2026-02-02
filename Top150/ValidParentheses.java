import java.util.*;

class Solution {
    public boolean isValid(String s){
        int len = s.length();
        if(len%2==1) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<len; i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || stack.pop()!=c) return false;
            }
        }
        return stack.isEmpty();
    }
}
