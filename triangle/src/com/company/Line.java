package com.company;

public class Line {
    double k;
    double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public static boolean isParallel(Line l1, Line l2){
        if(l1.k == l2.k){
            return true;
        }
        return false;
    }

    public static Point getCommonPoint(Line l1, Line l2){
        double x = (l2.b - l1.b)/(l1.k - l2.k);
        double y = l1.valueOnX(x);
        return new Point(x,y);
    }

    public double valueOnX(double x){
        return k * x + b;
    }

    @Override
    public String toString(){
        return "y = " + k + " * x" + b;
    }


}
