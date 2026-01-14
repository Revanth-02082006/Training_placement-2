import java.util.*;

public class TicTacToeAI {
    static char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

    static boolean isWinner(char p) {
        int[][] wins = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for (int[] w : wins) if (board[w[0]]==p && board[w[1]]==p && board[w[2]]==p) return true;
        return false;
    }

    static int minimax(char player) {
        if (isWinner('O')) return 1;
        if (isWinner('X')) return -1;
        if (new String(board).trim().length()==9) return 0;
        int best = (player=='O') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        for (int i=0;i<9;i++) {
            if (board[i]==' ') {
                board[i]=player;
                int score=minimax(player=='O'?'X':'O');
                board[i]=' ';
                best = (player=='O') ? Math.max(best,score) : Math.min(best,score);
            }
        }
        return best;
    }

    static int bestMove() {
        int move=-1, best=Integer.MIN_VALUE;
        for (int i=0;i<9;i++) {
            if (board[i]==' ') {
                board[i]='O';
                int score=minimax('X');
                board[i]=' ';
                if (score>best) { best=score; move=i; }
            }
        }
        return move;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("Enter move (0-8): ");
            int move=sc.nextInt();
            board[move]='X';
            if(isWinner('X')) {System.out.println("You win!"); break;}
            int ai=bestMove();
            board[ai]='O';
            System.out.println("AI plays at "+ai);
            if(isWinner('O')) {System.out.println("AI wins!"); break;}
        }
    }
}
