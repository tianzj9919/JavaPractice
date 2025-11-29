class Solution {
    public int candy(int[] ratings){
        int len = ratings.length;
        if(len ==0) return 0;

        int[] candies = new int[len];

        for(int i=0;i<len;i++){
            candies[i]=1;
        }

        for(int i=1;i<len;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]= candies[i-1]+1;
            }
        }
        for(int i=len-2;i>-1;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i], candies[i+1]+1);
            }
        }

        int sum =0;
        for(int c:candies){
            sum+=c;
        }
        return sum;
    }
}
