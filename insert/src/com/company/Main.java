package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {9,8,7,6,5,5,4,3,2,1};
        System.out.println("Array:" + Arrays.toString(myArray));
        insertSort(myArray);
        System.out.println("Array:" + Arrays.toString(myArray));
    }

    public static  int[] insertSort(int[] Array) {
        for (int left = 0; left < Array.length; left ++) {
            int value = Array[left];

            int a = left -1;

            for (; a>=0; a--) {
                if (value < Array[a]) {
                    Array[a+1] = Array[a];
                } else {
                    break;
                }
            }
            Array[a + 1] = value;
        }
        return Array;
    }

    public static int[] mergeSort(int[] Array) {



        return Array;
    }
}
