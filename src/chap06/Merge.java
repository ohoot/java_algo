package chap06;

import java.util.Arrays;

public class Merge {
    public static void main (String[] args) {
        int[] scores = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        int[] tmp = new int[scores.length];

        mergeSort(scores, tmp, 0, scores.length - 1);

        System.out.println(Arrays.toString(scores));
    }

    public static void mergeSort(int[] array, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(array, tmp, start, mid);
            mergeSort(array, tmp, mid + 1, end);
            merge(array, tmp, start, mid, end);
        }
    }

    public static void merge(int[] array, int[] tmp, int start, int mid, int end) {
        int lPointer = start;
        int rPointer = mid + 1;
        int tmpIdx = start;

        while (lPointer <= mid && rPointer <= end) {
            if (array[lPointer] <= array[rPointer]) {
                tmp[tmpIdx] = array[lPointer];
                lPointer++;
            } else {
                tmp[tmpIdx] = array[rPointer];
                rPointer++;
            }
            tmpIdx++;
        }

        if (lPointer <= mid) {
            for (int i = lPointer; i <= mid; i++) {
                tmp[tmpIdx] = array[i];
                tmpIdx++;
            }
        }

        if (rPointer <= end) {
            for (int i = rPointer; i <= end; i++) {
                tmp[tmpIdx] = array[i];
                tmpIdx++;
            }
        }

        for (int i = start; i <= end; i++) {
            array[i] = tmp[i];
        }
    }
}
