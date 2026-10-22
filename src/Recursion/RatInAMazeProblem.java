package Recursion;


import java.util.ArrayList;
import java.util.Collections;

public class RatInAMazeProblem {

    static boolean isSafeToMove(int newX, int newY, int n,
                                int[][] maze, boolean[][] visited) {

        if (newX < 0 || newX >= n || newY < 0 || newY >= n) {
            return false;
        } else if (maze[newX][newY] == 0) {
            return false;
        } else if (visited[newX][newY]) {
            return false;
        } else {
            return true;
        }
    }

    static void solve(int[][] maze, int srcX, int srcY,
                      int destX, int destY,
                      boolean[][] visited,
                      ArrayList<String> ans, String path) {

        if (srcX == destX && srcY == destY) {
            ans.add(path);
            return;
        }

        visited[srcX][srcY] = true;
        int n = maze.length;

        // Up
        int newX = srcX - 1;
        int newY = srcY;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY,
                    visited, ans, path + "U");
        }

        // Down
        newX = srcX + 1;
        newY = srcY;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY,
                    visited, ans, path + "D");
        }

        // Left
        newX = srcX;
        newY = srcY - 1;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY,
                    visited, ans, path + "L");
        }

        // Right
        newX = srcX;
        newY = srcY + 1;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY,
                    visited, ans, path + "R");
        }

        // Backtracking
        visited[srcX][srcY] = false;
    }

    public static ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();

        if (n == 0 || maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, n - 1, n - 1,
                visited, ans, "");

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        ArrayList<String> ans = ratInMaze(maze);

        if (ans.isEmpty()) {
            System.out.println("No path found");
        } else {
            System.out.println("Possible paths: " + ans);
        }
    }
}
