package chap06;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] scores = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        quickSort(scores, 0, scores.length - 1);

        System.out.println(Arrays.toString(scores));
    }

    public static void quickSort(int[] scores, int start, int end) {
        if (start >= end) {
            return;
        }

        int lPointer = start;
        int rPointer = end;

        int midIdx = (start + end) / 2;
        int midVal = scores[midIdx];

        scores[midIdx] = scores[rPointer];
        scores[rPointer] = midVal;

        rPointer--;

        while (lPointer <= rPointer) {
            boolean isTargetToSwapL = scores[lPointer] >= midVal;
            boolean isTargetToSwapR = scores[rPointer] <= midVal;

            if (isTargetToSwapL && isTargetToSwapR) {
                int tmp = scores[lPointer];
                scores[lPointer] = scores[rPointer];
                scores[rPointer] = tmp;

                lPointer++;
                rPointer--;
            } else {
                if (!isTargetToSwapL) lPointer++;
                if (!isTargetToSwapR) rPointer--;
            }
        }

        scores[end] = scores[lPointer];
        scores[lPointer] = midVal;

        quickSort(scores, start, lPointer - 1);
        quickSort(scores, lPointer + 1, end);
    }
}
