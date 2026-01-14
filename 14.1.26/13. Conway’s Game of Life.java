public class GameOfLife {
    static int N = 5;
    static int[][] grid = {
        {0,1,0,0,1},
        {1,0,1,0,0},
        {0,1,0,1,0},
        {0,0,1,0,1},
        {1,0,0,1,0}
    };

    static void nextGen() {
        int[][] newGrid = new int[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                int alive = 0;
                for (int x=-1;x<=1;x++)
                    for (int y=-1;y<=1;y++) {
                        if (x==0 && y==0) continue;
                        int ni=i+x,nj=j+y;
                        if (ni>=0&&nj>=0&&ni<N&&nj<N) alive+=grid[ni][nj];
                    }
                newGrid[i][j] = (grid[i][j]==1 && (alive==2||alive==3)) || (grid[i][j]==0 && alive==3) ? 1:0;
            }
        }
        grid = newGrid;
    }

    public static void main(String[] args) {
        for (int gen=0; gen<5; gen++) {
            System.out.println("Generation " + gen);
            for (int[] row : grid) {
                for (int cell : row) System.out.print(cell+" ");
                System.out.println();
            }
            nextGen();
        }
    }
}
