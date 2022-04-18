package main.quizzes;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int result = 0;

        Map<Integer, Integer> hm = new HashMap<>(A.length);

        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        for (int i : hm.keySet()) {
            if (hm.get(i) % 2 != 0) {
                result = i;
            }
        }

        return result;
    }
}
