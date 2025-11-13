public int removeElement(int[] nums, int val){
    int len = nums.length;
    int k=0;
    while(k<len){
        if(nums[k]==val){
            nums[k]=nums[len-1];
            len--;
        }else{
            k++;
        }
    }
    return k;
}