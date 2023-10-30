package edu.hw1;

public final class Task8 {

    private Task8() {
    }

    private static final int[][] COORDINATES = {
        {-2, -1},
        {-2, 1},
        {-1, -2},
        {-1, 2},
        {1, -2},
        {1, 2},
        {2, -1},
        {2, 1}
    };

    public static boolean knightBoardCapture(short[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    for (int[] point : COORDINATES) {
                        if (i + point[0] >= 0 && i + point[0] < arr.length
                            && j + point[1] >= 0 && j + point[1] < arr[i].length
                            && arr[i + point[0]][j + point[1]] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
