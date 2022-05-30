package main.quizzes;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;

        if (A[0] < 0 && A[1] < 0) maxA = A[0] * A[1] * A[A.length - 1];

        maxB = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];

        return Math.max(maxA, maxB);
    }
}
