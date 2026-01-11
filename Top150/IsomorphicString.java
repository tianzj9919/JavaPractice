import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t){
        int len = s.length();
        HashMap<Character,Character> map = new HashMap<>();

        for(int i = 0; i<len ; i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(!map.containsKey(sc)){
                if(map.containsValue(tc)) return false;
                map.put(sc,tc);
            }else{
                if(tc !=(map.get(sc))) return false;
            }
        }
        return true;
    }
}
