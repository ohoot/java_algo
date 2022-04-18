package main.quizzes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PermMissingElem {
    public int solution(int[] A) {
        int answer = 0;

        Set<Integer> hs = new HashSet<>(Arrays.stream(A).boxed().collect(Collectors.toList()));

        for (int i = 1; i <= A.length + 1; i++) {
            if (!hs.contains(i)) {
                answer = i;
            }
        }

        return answer;
    }
}
