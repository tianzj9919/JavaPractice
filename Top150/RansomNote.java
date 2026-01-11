import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote,String magazine){
        int mLen = magazine.length();
        int rLen = ransomNote.length();
        if(mLen<rLen) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<rLen;i++){
            char c = ransomNote.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i = 0; i<mLen;i++){
            char c = magazine.charAt(i);
            if(map.containsKey(c)&&map.get(c)>0){
                map.put(c,map.get(c)-1);
                rLen--;
            }
        }

        return rLen==0 ? true : false;
    }
}
