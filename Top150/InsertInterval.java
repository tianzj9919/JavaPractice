import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals,int[] newInterval){
        List<int[]> res = new ArrayList<>();
        if(intervals==null || intervals.length==0) return new int[][]{newInterval};

        int cur = 0;
        while(cur<intervals.length && intervals[cur][1]< newInterval[0]){
            res.add(intervals[cur]);
            cur++;
        }

        int start = newInterval[0];
        int end = newInterval[1];
        while(cur<intervals.length && intervals[cur][0]<= newInterval[1]){
            start = Math.min(start,intervals[cur][0]);
            end = Math.max(end,intervals[cur][1]);
            cur++;
        }
        res.add(new int[]{start,end});
        
        while(cur<intervals.length){
            res.add(intervals[cur]);
            cur++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
