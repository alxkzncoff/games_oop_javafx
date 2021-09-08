package ru.job4j.puzzle;

public class Win {
    public static boolean rowCheck(int[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board.length; column++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean columnCheck(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < 5; index++) {
            if (board[index][index] == 1) {
                result = (rowCheck(board, index) || columnCheck(board, index));
            }
        }
        return result;
    }
}
