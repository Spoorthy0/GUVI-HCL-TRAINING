public class NQueen {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='.';

            }
        }
        nQueen(board, 0);

    }
    public static void nQueen(char[][] board,int row){
        int n=board.length;
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.println(board[i][j]);
                }
                System.out.println();
            }
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,col)){
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row+1][j]='.';

            }
        }

    }
}
