package main.quizzes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int min = -1;

        for (int i = 1; i < A.length; i++) {
            int[] first = Arrays.copyOfRange(A, 0, i);
            int[] second = Arrays.copyOfRange(A, i, A.length);

            int firstSum = IntStream.of(first).sum();
            int secondSum = IntStream.of(second).sum();

            int diff = Math.abs(firstSum - secondSum);

            if (min == -1 || min > diff) min = diff;
        }

        return min;
    }

    public int betterSolution(int[] A) {
        int sum_fromFirst = 0;
        int sum_toLast = 0;

        for (int i = 0; i < A.length; i++) {
            sum_toLast += A[i];
        }

        int minDiff = Integer.MAX_VALUE;

        for (int p = 1; p < A.length; p++) {
            sum_fromFirst += A[p - 1];
            sum_toLast -= A[p - 1];

            int diff = Math.abs(sum_fromFirst - sum_toLast);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
