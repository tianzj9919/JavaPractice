public int removeDuplicates(int[] nums){
    int k=0;
    int cur=0;
    int len=nums.length;
    for(int i=0;i<len;i++){
        if(i==0){
            k++;
        }
        if(nums[i]!=nums[cur]){
            cur=i;
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
}