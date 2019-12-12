package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line: ");
        String line = reader.readLine();
        ArrayList<double[]> rows = new ArrayList<>();
        while (!line.equals("end")) {
            String[] lines = line.split(" ");
            double[] numbers = new double[lines.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Double.parseDouble(lines[i]);
            }
            rows.add(numbers);
            System.out.println("Enter new line: ");
            line = reader.readLine();
        }
        double[][] result = new rows.();
    }
