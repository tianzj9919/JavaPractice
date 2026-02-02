import java.util.*;

class Solution {
    public int calculate(String s){
        int res = 0;
        int sign = 1;
        int num = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = num*10 +(c-'0');
            }else if(c=='+'){
                res +=sign*num;
                num = 0;
                sign = 1;
            }else if(c=='-'){
                res +=sign*num;
                num = 0;
                sign = -1;
            }else if(c=='('){
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
                num = 0;
            }else if(c==')'){
                res += sign*num;
                num = 0;
                int presign = stack.pop();
                int preres = stack.pop();
                res = preres + presign*res;
            }else{

            }
        }
        res += sign*num;
        return res;
    }
}
