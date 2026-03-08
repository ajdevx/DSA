/* Rat in a Maze Problem

A rat is placed at the top-left cell (0,0) of an N × N maze.
The rat has to reach the bottom-right cell (N-1, N-1).

The maze contains:

1 → open path

0 → blocked cell

The rat can move in four directions:

D → Down

R → Right

U → Up

L → Left

The rat cannot visit the same cell more than once in a path.

Task

Write a program to print all possible paths from the start to the destination.
 */
 class RatMaze {

    static int n;

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        n = maze.length;

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, visited, "");
    }

    static void solve(int[][] maze, int row, int col, boolean[][] visited, String path) {

        // base case
        
        if(row<0 || col <0 || row >= maze.length || col >= maze[0].length) return;
        if(maze[row][col] == 0 || visited[row][col] == true) return;
        
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(path);
            return;
        }
    

        // mark visited
        visited[row][col] = true;

        // move Down
        solve(maze, row+1, col, visited, path+'D');

        // move Right
        solve(maze, row, col+1, visited, path+'R');

        // move Up
        solve(maze, row-1, col, visited, path+'U');

        // move Left
        solve(maze, row, col-1, visited, path+'L');

        // backtrack (unmark visited)
        visited[row][col] = false;

    }
}