class Solution{
public int jump(int[] nums) {
    int len = nums.length;
    int curEnd = 0;
    int curFar=0;
    int count =0;
    if(len<2) return 0;
    for(int i=0; i<len-1;i++){
        curFar = Math.max(curFar,i+nums[i]);
        if(i==curEnd){
            count++;
            curEnd = curFar;
        }
    }
    return count;
}
}