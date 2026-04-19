import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for(int col = 0; col <board [row].length; col++){
                board[row][col] =' ';
            }
            }

        char player='X';
        boolean gameOver=false;

        Scanner sc=new Scanner(System.in);

        while(!gameOver){
             printBoard(board);
            System.out.println("Player "+player+"enter:");
            int r=sc.nextInt();
            int c=sc.nextInt();

            if(board[r][c]==' '){
                board[r][c]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("player "+player+" has won");
                }else{
                    player=player=='X'?'O':'X';
                }
            }else{
                System.out.println("Invalid move try again");
            }
        }
        printBoard(board);
        }

    private static boolean haveWon(char[][] board, char player) {

    }

    private static void printBoard(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col <board [row].length; col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
}

