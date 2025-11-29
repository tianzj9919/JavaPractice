class Solution {
    public int[] productExceptSelf(int[] nums){
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] answer = new int[len];
        if(len<2){
            answer[0] = 0;
            return answer;
        }else{
            prefix[0] = 1;
            suffix[len-1] = 1; 
        }
        for(int i =1;i<len;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for(int i =len-2;i>-1;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        for(int i =0;i<len;i++){
            answer[i]=prefix[i]*suffix[i];
        }
        return answer;
    }
}
