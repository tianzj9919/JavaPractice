import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites){
        int[] ans = new int[numCourses];
        List<List<Integer>> g = new ArrayList<>();

        for(int i = 0; i<numCourses;i++){
            g.add(new ArrayList<>());
        }

        int[] ind = new int[numCourses];

        for(int[] p : prerequisites){
            int a = p[0];
            int b = p[1];
            g.get(b).add(a);
            ind[a]++;
        }

        Deque<Integer> q = new ArrayDeque<>();

        for(int i = 0;i<numCourses;i++){
            if(ind[i]==0) q.add(i);
        }

        int taken =0;

        while(!q.isEmpty()){
            int cur = q.poll();
            ans[taken++] = cur;

            for(int next : g.get(cur)){
                if(--ind[next]==0) q.add(next);
            }
        }

        return (taken==numCourses) ? ans : new int[0];
    }
}
