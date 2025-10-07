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
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row+1][j]='.';

            }
        }

    }
    public static boolean isSafe(char[][] board,int row,int col){
        int n=board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //upper right
        int i=row;
        int j=col;
        while(i<=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //lower right
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //Upper left

        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        //lower left

        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        return true;
    }
}
