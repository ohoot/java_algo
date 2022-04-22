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
}
