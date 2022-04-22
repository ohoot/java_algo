package main.quizzes;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        if (A.length < X) return -1;

        int answer = -1;

        Set<Integer> floatingLeaves = new HashSet<>();
        boolean hasLeaves = false;

        for (int i = 0; i < A.length; i++) {
            floatingLeaves.add(A[i]);
            if (i >= X - 1) {
                for (int j = 1; j <= X; j++) {
                    if (floatingLeaves.contains(j)) {
                        hasLeaves = true;
                    } else {
                        hasLeaves = false;
                        break;
                    }
                }

                if (hasLeaves) {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }

    public int betterSolution(int X, int[] A) {
        Set<Integer> per = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            if(A[i] < X) per.add(A[i]);
            if(per.size() == X - 1) return i;
        }
        return -1;
    }
}
