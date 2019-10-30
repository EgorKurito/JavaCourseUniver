package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println(factor(6));
    }
    public static int factor(int num) {
       if (num ==1) {
           return num;
       }
       return num * factor(num-1);
    }
}
