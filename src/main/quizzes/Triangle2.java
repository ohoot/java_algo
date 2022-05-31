package main.quizzes;

import java.util.Arrays;

public class Triangle2 {
    public int solution(int[] A) {
        Arrays.sort(A);

        int result = 0;

        for (int i = 0; i < A.length - 2; i++) {
            long first = A[i];
            long second = A[i + 1];
            long third = A[i + 2];

            if (first + second > third && second + third > first && first + third > second) {
                result = 1;
                break;
            }
        }

        return result;
    }
}
