package maze;

import java.util.Arrays;

public class allDir {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        allPathwc("",board,0,0,new int[board.length][board[0].length],1);
    }
    static void allPathMaze(String p, boolean[][] maze, int r, int c){

        if(r==maze.length-1 && c== maze[0].length-1){

            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            allPathMaze(p+'d',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPathMaze(p+'r',maze,r,c+1);
        }
        if(r>0){
            allPathMaze(p+'u',maze,r-1,c);
        }
        if(c>0){
            allPathMaze(p+'l',maze,r,c-1);
        }
        maze[r][c]=true;

    }

    static void allPathwc(String p, boolean[][] maze, int r, int c,int[][] path,int step){

        if(r==maze.length-1 && c== maze[0].length-1){
            path[r][c]=step;
            for(int[] row : path){
                System.out.println(Arrays.toString(row));
            }
            System.out.println(p);
            System.out.println();

            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allPathwc(p+'d',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathwc(p+'r',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathwc(p+'u',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathwc(p+'l',maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;

    }



}
