package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1,2,4,6,5,3,7,8,9,6,9,9};
        System.out.println("Array:" + Arrays.toString(myArray));
        mergeSort(myArray,0,myArray.length-1);
        System.out.println("Array:" + Arrays.toString(myArray));
    }

    public static void mergeSort(int[] source, int left, int right) {
        int pivot = left + ((right - left) / 2) + 1;

        if (pivot > 0 && right > (left + 1)) {
            mergeSort(source, left, pivot - 1);
            mergeSort(source, pivot, right);
        }
        int[] buffer = new int[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (pivot > right || source[cursor] > source[pivot]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[pivot];
                pivot++;
            }
        }
        System.arraycopy(buffer, 0 , source, left, buffer.length);
    }

}
