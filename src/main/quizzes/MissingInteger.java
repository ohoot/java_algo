package main.quizzes;

import java.util.*;

public class MissingInteger {
    class Solution {
        public int solution(int[] A) {
            int result = -1;

            Arrays.sort(A);

            if (A[A.length - 1] < 1) return 1;

            for (int i = 1; i < A[A.length - 1]; i++) {
                if (Arrays.binarySearch(A, i) < 0) {
                    result = i;
                    break;
                }
            }

            if (result == -1) result = A[A.length - 1] + 1;

            return result;
        }
    }

}
