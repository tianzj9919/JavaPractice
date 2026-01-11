import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0|| matrix[0].length==0) return ans;
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};

        int row = 0;
        int col = 0;
        int dir = 0;

        for(int i =0;i<m*n;i++){
            ans.add(matrix[row][col]);
            visited[row][col] = true;

            int nr = row + dr[dir];
            int nc = col + dc[dir];

            if(nr<0||nr>=m||nc<0||nc>=n||visited[nr][nc]){
                dir = (dir+1)%4;
                nr = row + dr[dir];
                nc = col + dc[dir];
            }

            row = nr;
            col = nc;
        }
        return ans;
    }
}
