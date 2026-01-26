import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums){
        List<String> ans = new ArrayList<>();
        int len = nums.length;
        if(len==0) return ans;

        int i =0;

        while(i<len){
            int left = nums[i];

            while(i+1<len && nums[i+1]== nums[i]+1){
                i++;
            }

            int right = nums[i];

            if(left==right){
                ans.add(String.valueOf(left));
            }else{
                ans.add(left + "->" + right);
            }
            i++;
        }

        return ans;
    }
}
