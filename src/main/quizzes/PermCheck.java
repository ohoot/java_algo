package main.quizzes;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int answer = -1;

        Arrays.sort(A);

        if (A[0] == 1 && A.length == A[A.length - 1]) answer = 1;
        else answer = 0;

        return answer;
    }
}
