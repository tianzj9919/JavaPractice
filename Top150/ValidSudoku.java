class Solution{
    public boolean isValidSudoku(char[][] board){
        int[][] row_check = new int[9][9];
        int[][] col_check = new int[9][9];
        int[][][] block_check = new int[3][3][9];
        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                if(board[i][j]!='.'){
                    int c = board[i][j]-'1';
                    if(row_check[i][c]==0 && col_check[j][c]==0 && block_check[i/3][j/3][c]==0){
                        row_check[i][c]=1;
                        col_check[j][c]=1;
                        block_check[i/3][j/3][c]=1;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}