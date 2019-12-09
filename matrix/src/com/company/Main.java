package com.company;

public class Main {

    public static void main(String[] args) {
        double[][] test = new double[2][2];
        test[0][0] = 12;
        test[0][1] = 1;
        test[1][0] = 1;
        test[1][1] = 1;

        myMatrix M = new myMatrix(test);
        System.out.println(M);

        double[][] test1 = new double[2][2];
        test1[0][0] = 1;
        test1[0][1] = 1;
        test1[1][0] = 1;
        test1[1][1] = 1;

        myMatrix M1 = new myMatrix(test1);
        System.out.println(M1);

        System.out.println(myMatrix.multMatrix(M,M1));
    }
}
