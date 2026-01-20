package maze;

public class obstacle {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        obstacleMaze("",board,0,0);
    }
    static void obstacleMaze(String p, boolean[][] maze,int r, int c){

        if(r==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            obstacleMaze(p+'d',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            obstacleMaze(p+'r',maze,r,c+1);
        }

    }
}
