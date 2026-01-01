class Solution {
    public String reverseWords(String s){
        int len = s.length();
        if(len==0) return "";
        int cur = len-1;
        String res = "";

        while(cur>-1){
            while(cur>-1 && s.charAt(cur)==' '){
                cur--;
            }
            if(cur==-1) break;
            int i = cur;
            while(cur>-1 && s.charAt(cur)!=' '){
                cur--;
            }
            res += s.substring(cur+1, i);
            res += " ";
        }

        res = res.substring(0,res.length()-1);
        return res;
    }
}
