class Solution {
    public int[] twoSum(int[] numbers, int target){
        int r = numbers.length-1;
        int l = 0;


        while(l<r){
            int diff = target - numbers[l];
            while(numbers[r]>diff && l<r) r--;
            if(numbers[r]==diff) {
                return new int[] {l+1,r+1};
            }
            l++;
        }
        return new int[] {-1,-1};
    }
}
