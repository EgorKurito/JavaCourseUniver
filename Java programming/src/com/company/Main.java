package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int min = 20;
        int max = 140;
	    int[] a = createRandomArray(10, min, max);
        printArray(a);
        int[] b = sortArrayInc(a);
        printArray(b);

    }

    private static int[] createArray(int len) {
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = len - i;
        }
        return a;
    }

    private static int[] createRandomArray(int len, int Min, int Max) {
        /* Сделать свободнуб границу формирования рандомных чисел */
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = Min + (int)(Math.random() * ((Max - Min) + 1));
        }
        return a;
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(" " + value);
        }
        System.out.println(" ");
    }

    private static int[] sortArrayInc(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]) {
                    int c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }
            }
        }
        return arr;
    }

}

