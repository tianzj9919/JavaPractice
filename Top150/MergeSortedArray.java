class Solution{
    public void merge(int[]nums1, int m, int[]nums2,int n){
        int len = m + n;
        while(m!=0&&n!=0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[len-1]=nums2[n-1];
                n--;
                len--;
            }else{
                nums1[len-1]=nums1[m-1];
                m--;
                len--;
            }
        }
        while(n!=0){
            nums1[len-1]=nums2[n-1];
            n--;
            len--;
        }
    }
}