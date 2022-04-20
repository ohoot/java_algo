package main.quizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandSort {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];

            int idx = 0;
            int[] arr = new int[end - start];

            for (int j = start; j < end; j++) {
                arr[idx++] = array[j];
            }

            Arrays.sort(arr);
            list.add(arr[commands[i][2] - 1]);
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }
}
