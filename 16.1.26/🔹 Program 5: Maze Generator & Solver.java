import java.util.*;

class Maze {
    private final int rows, cols;
    private final int[][] maze;
    private final Random rand = new Random();

    public Maze(int rows, int cols) {
        this.rows = rows; this.cols = cols;
        maze = new int[rows][cols];
        generate(0, 0);
    }

    private void generate(int r, int c) {
        int[] dirs = {0,1,2,3};
        Collections.shuffle(Arrays.asList(dirs));
        for (int d : dirs) {
            int nr = r + (d==0?-2:d==1?2:0);
            int nc = c + (d==2?-2:d==3?2:0);
            if (nr>=0 && nc>=0 && nr<rows && nc<cols && maze[nr][nc]==0) {
                maze[r+(nr-r)/2][c+(nc-c)/2] = 1;
                maze[nr][nc] = 1;
                generate(nr,nc);
            }
        }
    }

    public void print() {
        for (int[] row : maze) {
            for (int cell : row) System.out.print(cell==1?"  ":"##");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Maze m = new Maze(15,15);
        m.print();
    }
}
