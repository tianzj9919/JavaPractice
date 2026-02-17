import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>> g = new ArrayList<>();

        for(int i = 0; i<numCourses;i++) g.add(new ArrayList<>());

        int[] indeg = new int[numCourses];

        for(int[]p : prerequisites){
            int a = p[0];
            int b = p[1];
            g.get(b).add(a);
            indeg[a]++;
        }

        Deque<Integer> q = new ArrayDeque<>();

        for(int i =0; i<numCourses;i++){
            if(indeg[i]==0) q.add(i);
        }

        int taken =0;

        while(!q.isEmpty()){
            int cur = q.poll();
            taken++;

            for(int next : g.get(cur)){
                if(--indeg[next]==0) q.add(next);
            }
        }

        return taken == numCourses;
    }
}
