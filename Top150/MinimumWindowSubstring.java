import java.util.*;

class Solution {
    public String minWindow(String s, String t){
        int m = s.length();
        int n = t.length();
        if(n>m) return "";

        HashMap<Character,Integer> need = new HashMap<>();
        for(int i = 0; i<n; i++){
            char c = t.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int missing = n;
        int left = 0;
        int start = 0;
        int bestLen = m+1;

        for(int right = left; right<m; right++){
            char c = s.charAt(right);

            if(need.getOrDefault(c,0)>0) missing--;
            if(need.containsKey(c)) need.put(c,need.get(c)-1);

            while(missing == 0){
                int len = right - left +1;
                if(len<bestLen){
                    start = left;
                    bestLen = len;
                }

                char lc = s.charAt(left);
                if(need.containsKey(lc)) {
                    need.put(lc,need.get(lc)+1);
                    if(need.get(lc)>0) missing++;
                }
                left++;
            }
        }
        return bestLen == m+1 ? "" : s.substring(start,start+bestLen);
    }
}
