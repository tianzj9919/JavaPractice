class Solution{
public int maxProfit(int[] prices){
    int buy =prices[0];
    int sell =0;
    int res =0;
    int len = prices.length;
    if(len<2) return 0;
    for(int i = 1;i<len;i++){
        if(prices[i]>prices[i-1]){
            sell = prices[i];
        }else{
            if(sell !=0){
                res+=sell-buy;
            }
            buy = prices[i];
            sell =0;
        }
    }
    if(sell!=0){
        res+=sell-buy;
    }
    return res;
}
}