package Backtracking;

public class Nqueen {

    public static boolean issafe(char board [][],int row,int col) {
        //vertical up
        for(int i = row-1;i>0;i++) {
            if(board[i][col] == 'q') {
                return false;
            }
        }

        //diagonal left up
        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j)
    }
    public static void nqueen(char board[][],int row) {
        //base case
        if( row== board.length) {
printboard(board) {
    return ;
}
// colum loop 
for(int j =0;j<board.length;j++) {
    if(issafe(board,row,j)) {
        board[row][j] = 'q';
        //function call
        nqueen(board,row+1);
        board[row][j] = 'x'; //backtraking set



    }
    
}
        }
    }
}
