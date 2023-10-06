package edu.hw1;

public final class Task8 {
    public static boolean knightBoardCapture(short[][] arr) {
        int[] X = {-2, -1, 1, 2};
        int[] sign_for_y = {-1, 1};
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == 1)
                    for (int x : X)
                        for (int s : sign_for_y) {
                            int y = (2 / x)*s;
                            if (i + x >= 0 && i + x < arr.length &&
                                j + y >= 0 && j + y < arr[i].length && arr[i + x][j + y] == 1)
                                return false;
                        }
        return true;
    }
}
