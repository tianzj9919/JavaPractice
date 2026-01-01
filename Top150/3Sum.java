import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;

        for(int i =0;i<len-2;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int l = i+1;
            int r = len -1;
            int target = -nums[i];

            for(;l<r;l++){
                if(l!=i+1 && nums[l]==nums[l-1]) continue;
                while(nums[l]+nums[r]> target && l<r) r--;
                if(l==r) break;
                if(nums[l]+nums[r]==target){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    arr.add(ans);
                }
            }
        }
        return arr;
    }
}
