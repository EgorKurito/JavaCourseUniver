package com.company;

public class Main {

    public static void main(String[] args) {
	Line l1  = new Line(0, 0);
	Line l2 = new Line(1, 0);
	Line l3 = new Line(-1, 2);

	if (triangleable(l1,l2,l3)){
        Point p1 = Line.getCommonPoint(l1,l2);
        Point p2 = Line.getCommonPoint(l2,l3);
        Point p3 = Line.getCommonPoint(l3,l1);

        double s = findSquare(p1,p2,p3);
        System.out.println("Square: " + s);
    } else {
	    System.out.println("Triangle is not created");
    }

    }

    public static boolean paralleleable(Line line1, Line line2, Line line3){
        if (Line.isParallel(line1,line2) || Line.isParallel(line1,line3) || Line.isParallel(line2,line3)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean triangleable(Line line1, Line line2, Line line3){
        if(paralleleable(line1,line2,line3)){
            return false;
        }

        Point p1 = Line.getCommonPoint(line1,line2);
        Point p2 = Line.getCommonPoint(line2,line3);
        Point p3 = Line.getCommonPoint(line3,line1);

        if(Point.isEqual(p1,p2) || Point.isEqual(p2,p3) || Point.isEqual(p3,p1)){
            return false;
        }else {
            return true;
        }
    }

    public static double findSquare(Point p1, Point p2, Point p3){
        double a = Point.distance(p1,p2);
        double b = Point.distance(p2,p3);
        double c = Point.distance(p3,p1);

        double p =(a+b+c)/2;

        return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
