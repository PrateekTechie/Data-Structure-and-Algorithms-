package Backtracking;

public class maze {
    public static void printsolution(int sol[][] ) {  // i is the row and j is the column
        for(int  i =0;i<sol.length;i++) {
            for(int j =0;j<sol.length;j++) {
                System.out.print(" "+ sol[i][j]);
            }
            System.out.println();
        }
    } 
    public static boolean issafe(int maze[][],int x,int y) {
        if(x>=0 && x<maze.length && y>=0 && y<maze.length&& maze[x][y] == 1) {
            return true;
        }
        return false;
    }
    public static boolean solvemaze(int maze[][]) {
           int N = maze.length;
           int sol[][] = new int[N][N];
           if(solvemazeutil(maze,0,0,sol) == false) {
                System.out.println("solution does not exist");
                return false;
           }
           printsolution(sol);
           return true; 
        }
        public static boolean solvemazeutil(int maze[][],int x,int y,int sol[][]) {
            if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1) {
                sol[x][y] = 1;
                return true;
            } 
            if(issafe(maze,x,y) == true) {
                sol[x][y] = 1;
                return false;
                sol[x][y] =0;
                if(solvemazeutil(maze,x+1,y,sol)) {
                 return true;
                 if(solvemazeutil(maze,x,y+1,sol)) {
                    return true;
                    sol[x][y] = 0;
                    return false;
                 }
                 return false;
                }
               
                }
                
            
        
    }
    public static void main(String args[]) {
                    int maze [][] = {{1,0,0,0},
                                  {1,1,0,1},
                                  {0,1,0,0},
                                  {1,1,1,1}};
                                  solvemaze(maze);
        }
    }
