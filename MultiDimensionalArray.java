public class MultiDimensionalArray {
    public static void main(String[] args) {
        char tictactoe[][] = {
            {'a','b'},
            {'c','d'}
        };
      //  System.out.println(tictactoe[0][0]);

        int table[][] = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
