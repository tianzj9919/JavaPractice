import java.util.*;

class Solution {
    public boolean wordPattern (String pattern, String s){
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        HashMap<Character,String> map = new HashMap<>();

        for(int i =0; i< pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(!map.containsKey(c)){
                if(map.containsValue(w)) return false;
                map.put(c,w);
            }else{
                if(!map.get(c).equals(w)) return false;
            }
        }

        return true;
    }
}
