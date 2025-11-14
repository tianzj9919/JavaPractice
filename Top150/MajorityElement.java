class Solution{
public int majorityElement(int[] nums){
    int count =0;
    int res = 0;
    int len = nums.length;
    for(int i = 0;i<len;i++){
        if(count ==0){
            res = nums[i];
            count++;
        }else{
            if(nums[i]==res){
                count++;
            }else{
                count--;
            }
        }
    }
    return res;
}
}