public int removeDuplicates(int[] nums){
    int len = nums.length;
    if(len<=2){
        return n;
    }
    int k=2;
    for(int i=2;i<len;i++){
        if(nums[i]!=nums[k-2]){
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
}