package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] myArray = {9,2,3,4,6,7,8,4,7,8,4};
	System.out.println("Array:" + Arrays.toString(myArray));
	quickSort(myArray,0,myArray.length-1);
	System.out.println("Array:" + Arrays.toString(myArray));

    }

    public static int[] quickSort(int[] source, int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int pivot = source[(left + right) / 2];
        do {
            while (source[left] < pivot) {
                left++;
            }
            while (source[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int tmp = source[left];
                    source[left] = source[right];
                    source[right] = tmp;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < rightBorder) {
            quickSort(source, left, rightBorder);
        }
        if(leftBorder < right) {
            quickSort(source, leftBorder, right);
        }
        return source;
    }
}
