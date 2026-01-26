import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums,int k){
        int len = nums.length;
        if(len<2) return false;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<len;i++){
            int cur = nums[i];
            if(map.containsKey(cur)){
                if(k>=i-map.get(cur)) return true;
            }
            map.put(cur,i);
        }
        return false;
    }
}
