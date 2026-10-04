package Backtracking;

public class sudoko {
    public static boolean issafe(int board[][],int row,int col,int digit) {
        //row and col
        for(int i = 0;i<=8;i++) {
            if(board[i][col] == digit) {
                return false;
            }
            for(int j = 0;j<=8;j++) {
                if(board[row][j] == digit) {
                    return false;
                }
            }
        }
            //grid
            int sr = (row/3)*3;
            int sc = (col/3)*3;
            for(int i = sr;i<sr+3;i++) {
                for(int j = sc;j<sc+3;j++) {
                    if(board[i][j] == digit) {
                        return false;
                    }
                }
            }
        
        return true;
    }
    public static boolean sudokosolver(int board[][], int row, int col) {
        //base case 
        if( row == 9 && col ==  0) {
            return true;
        } 
        //recursion
        int nextrow = row,nextcol = col +1;
        if(col+1 == 9) {
            nextrow = row +1;
            nextcol = 0;
            if(board[row][col] !=0) {
                return sudokosolver(board,nextrow,nextcol);
            }
        }
        for(int digit = 1;digit <=9;digit++) {
            if(issafe(board,row,col,digit)) {
                board[row][col] = digit;
                if(sudokosolver(board,nextrow,nextcol)) {
                    return true;
                }
                board[row][col] = 0;

            }
        }
        return sudokosolver(board, nextrow, nextcol);
    }
    public static void printboard(int board[][]) {
        for(int i = 0;i<9;i++) {
            for(int j = 0;j<9;j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        int board[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                        { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                        { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                        { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                        { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                        { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                        { 0, 6, 0, 0, 0, 0, 2 ,8 ,0 },
                        { 0 ,0 ,0 ,4 ,1 ,9 ,0 ,0 ,5 },
                        { 0 ,0 ,0 ,0 ,8 ,0 ,7 ,9 ,9 } };
                        if(sudokosolver(board,0,0)) {
                            System.out.println("solution exits");
                            printboard(board);

                        } else {
                            System.out.println("solution does not exits");
                        }
    }
    
}
