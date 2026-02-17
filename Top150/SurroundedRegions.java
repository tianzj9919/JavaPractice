import java.util.*;

class Solution {
    public void solve(char[][] board){
        if(board == null||board.length==0) return;
        int m = board.length;
        int n = board[0].length;

        Deque<int[]> q = new ArrayDeque<>();

        for(int i =0;i<m;i++){
            if(board[i][0]=='O'){
                board[i][0] = 'S';
                q.add(new int[]{i,0});
            }
            if(board[i][n-1]=='O'){
                board[i][n-1] = 'S';
                q.add(new int[]{i,n-1});
            }
        }

        for(int j =0;j<n;j++){
            if(board[0][j] == 'O'){
                board[0][j] = 'S';
                q.add(new int[]{0,j});
            }
            if(board[m-1][j]== 'O'){
                board[m-1][j] ='S';
                q.add(new int[]{m-1,j});
            }
        }

        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int k =0;k<4;k++){
                int nr = r +dr[k];
                int nc = c +dc[k];
                if(nr >= 0 && nr < m && nc >=0 && nc <n && board[nr][nc]== 'O'){
                    board[nr][nc] = 'S';
                    q.add(new int[]{nr,nc});
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O') board[i][j] = 'X';
                else if(board[i][j]=='S') board[i][j] = 'O';
            }
        }
        
    }
}
