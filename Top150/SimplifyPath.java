import java.util.*;

class Solution {
    public String simplifyPath(String path){
        Deque<String> stack = new ArrayDeque<>();

        String res = "";

        for(String part: path.split("/")){
            if(part.equals("")||part.equals(".")) continue;
            if(part.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else{
                stack.push(part);
            }
        }
        if(stack.isEmpty()) return "/";

        while(!stack.isEmpty()){
            res = "/"+stack.pop()+res; 
        }

        return res;
    }
}
