package com.company;

public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }

    public static boolean isEqual(Point p1, Point p2){
        if (distance(p1,p2) > 0) {
            return false;
        } else {
            return true;
        }
    }
}
