package com.company;

public class complex {

    int Re;
    int Im;

    public complex(int Re, int Im) {
        this.Re = Re;
        this.Im = Im;
    }

    public complex() {
        Re = 0;
        Im = 0;
    }

    public void setRe(int Re) {
        this.Re = Re;
    }

    public void setIm(int Im) {
        this.Im = Im;
    }

    public void print(){
        String result = " ";
        if (Re != 0){
            if (Im != 0){
                if (Im == -1){
                    result = Re + " + " + "-i";
                } else if (Im == 1) {
                    result = Re + " + " + "i";
                } else result = Re + " + " + Im + "i";
            } else {
                result = Re + " ";
            }
        } else  if (Im != 0){
            if (Im != -1){
                result = Im + "i";
            } else {
                result = "-i";
            }
        } else {
            result = "0";
        }

        System.out.println(result);
    }

    public static complex sum(complex a, complex b) {

        return new complex(a.Re + b.Re, a.Im + b.Im);
    }

    public static complex multiply(complex a, complex b) {

        return new complex(a.Re * b.Re - a.Im * b.Im, b.Re * a.Im + a.Re * b.Im);
    }
}
