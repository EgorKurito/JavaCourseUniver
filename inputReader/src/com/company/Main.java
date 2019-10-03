package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int a = readInt();
        System.out.println(a);
    }

    public static int readInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        int result = 0;
        String s = "test";
        boolean isInt = false;

        while (!isInt) {
            System.out.println("Please enter a number");
            s = reader.readLine();
            try {
                result = Integer.parseInt(s);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Sorry, it's a number(");

            }
        }
        return result;
    }
}
