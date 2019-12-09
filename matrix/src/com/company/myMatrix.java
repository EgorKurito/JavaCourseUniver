package com.company;

import java.util.Arrays;

public class myMatrix {

    double[][] data;
    int rows = 0;
    int cols = 0;

    public myMatrix(double[][] data) {
        this.data = data.clone();
        rows = this.data.length;
        cols = this.data[0].length;
    }

    public static myMatrix multMatrix(myMatrix M1, myMatrix M2){
        if (M1.cols != M2.rows){
            throw new colmsUniqleToRowsExeption();
        }

        double [][] resMyltAr = new double[M1.rows][M2.cols];
        for (int i = 0; i < resMyltAr.length; i++) {
            for (int j = 0; j < resMyltAr[0].length; j++) {
                double elem = 0;
                for (int k = 0; k < M1.cols; k++) {
                    elem += M1.data[i][k] * M2.data[k][j];
                }
                resMyltAr[i][j] = elem;
            }
        }
        return new myMatrix(resMyltAr);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                res += data[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
