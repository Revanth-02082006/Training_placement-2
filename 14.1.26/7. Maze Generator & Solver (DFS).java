import java.util.*;

public class Maze {
    static int N = 5;
    static int[][] maze = new int[N][N];
    static boolean[][] visited = new boolean[N][N];

    static void generateMaze() {
        Random rand = new Random();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                maze[i][j] = rand.nextInt(2); // 0 = path, 1 = wall
        maze[0][0] = 0; maze[N-1][N-1] = 0;
    }

    static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] == 1 || visited[x][y]) return false;
        visited[x][y] = true;
        if (x == N-1 && y == N-1) return true;
        return dfs(x+1,y) || dfs(x-1,y) || dfs(x,y+1) || dfs(x,y-1);
    }

    public static void main(String[] args) {
        generateMaze();
        System.out.println("Path exists? " + dfs(0,0));
    }
}
