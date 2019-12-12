package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 11;
        int[][] matrix = new int[n][n];
        fillMatrix(matrix);
        long begin = System.currentTimeMillis();
        System.out.println(det(matrix));
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - begin));

    }

    public static int det(int[][] m) {
        if (m.length == 1) {
            return m[0][0];
        }
        int result = 0;
        for (int i = 0; i < m[0].length; i++) {
            int[][] minor = createMinor(m, 0, i);
            int sign = 1;
            if (i % 2 == 0) {
                sign = 1;
            } else {
                sign = -1;
            }
            result += sign * m[0][i] * det(minor);
        }

        return result;
    }

    public static int[][] createMinor(int[][] m, int row, int column) {
        int[][] minor = new int[m.length - 1][m[0].length - 1];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == row || j == column) {
                    continue;
                }
                int rowIndex = 0;
                int colIndex = 0;

                if (i > row) {
                    rowIndex = i - 1;
                } else {
                    rowIndex = i;
                }

                if (j > column) {
                    colIndex = j - 1;
                } else {
                    colIndex = j;
                }
                minor[rowIndex][colIndex] = m[i][j];
            }
        }
        return minor;
    }

    public static void fillMatrix(int[][] m){
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <m[0].length ; j++) {
                m[i][j] = r.nextInt(100)+1;

            }

        }
    }
}
