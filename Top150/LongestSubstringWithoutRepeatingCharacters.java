import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s){
        int len = s.length();
        if(len<2) return len;
        int maxLen = 0;
        int curLen = 0;
        int l = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int r =0; r< len;r++){
            char c = s.charAt(r);
            if(!map.containsKey(c) || map.get(c)<l){
                map.put(c,r);
                curLen++;
                maxLen = Math.max(maxLen,curLen);
            }else{
                l = map.get(c)+1;
                map.put(c,r);
                curLen = r - l +1;
            }
        }

        return maxLen;
    }
}
