import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points){
        int len = points.length;
        if(len==1) return 1;

        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));

        int curStart = points[0][0];
        int curEnd = points[0][1];
        int count = 0;

        for(int i = 1 ; i<len ;i++){
            int start = points[i][0];
            int end = points[i][1];

            if(start<=curEnd){
                curStart = start;
                curEnd = Math.min(curEnd,end);
            }else{
                count++;
                curStart = start;
                curEnd = end;
            }
        }
        return ++count;
    }
}
