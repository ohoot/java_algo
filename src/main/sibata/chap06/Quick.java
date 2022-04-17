package main.sibata.chap06;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] scores = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        quickSort(scores, 0, scores.length - 1);

        System.out.println(Arrays.toString(scores));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int lPointer = start;
        int rPointer = end;

        int midIdx = (start + end) / 2;
        int midVal = array[midIdx];

        array[midIdx] = array[rPointer];
        array[rPointer] = midVal;

        rPointer--;

        while (lPointer <= rPointer) {
            boolean isTargetToSwapL = array[lPointer] >= midVal;
            boolean isTargetToSwapR = array[rPointer] <= midVal;

            if (isTargetToSwapL && isTargetToSwapR) {
                int tmp = array[lPointer];
                array[lPointer] = array[rPointer];
                array[rPointer] = tmp;

                lPointer++;
                rPointer--;
            } else {
                if (!isTargetToSwapL) lPointer++;
                if (!isTargetToSwapR) rPointer--;
            }
        }

        array[end] = array[lPointer];
        array[lPointer] = midVal;

        quickSort(array, start, lPointer - 1);
        quickSort(array, lPointer + 1, end);
    }
}
