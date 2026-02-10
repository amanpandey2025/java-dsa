package setsQuestions;

public class mazeWithRock {

    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        rock("", board, 0, 0);
    }

    static void rock(String path, boolean[][] maze, int row, int column) {

        // blocked or already visited
        if (!maze[row][column]) {
            return;
        }

        // destination reached
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        // mark as visited
        maze[row][column] = false;

        // Down
        if (row < maze.length - 1) {
            rock(path + 'D', maze, row + 1, column);
        }

        // Right
        if (column < maze[0].length - 1) {
            rock(path + 'R', maze, row, column + 1);
        }

        // Up
        if (row > 0) {
            rock(path + 'U', maze, row - 1, column);
        }

        // Left
        if (column > 0) {
            rock(path + 'L', maze, row, column - 1);
        }

        // 🔥 BACKTRACK (restore cell)
        maze[row][column] = true;
    }
}
