package com.company;

public class Main {

    public static void main(String[] args) {
        complex b = new complex(5,1 );
        b.print();

        complex a = new complex();
        a.setRe(5);
        a.setIm(2);
        a.print();

        complex c = complex.sum(a, b);
        c.print();

        complex d = complex.multiply(a, b);
        d.print();
    }
}
