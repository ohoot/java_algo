package main.quizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxScore {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) scores[0]++;
            if (answers[i] == second[i % second.length]) scores[1]++;
            if (answers[i] == third[i % third.length]) scores[2]++;
        }

        int max = Arrays.stream(scores).max().getAsInt();
        List<Integer> list = new ArrayList<>(scores.length);

        for (int j = 0; j < scores.length; j++) {
            if (scores[j] == max) list.add(j + 1);
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }
}
