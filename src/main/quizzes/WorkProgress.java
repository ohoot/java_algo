package main.quizzes;

import java.util.Arrays;

public class WorkProgress {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] leftDays = new int[progresses.length];
        int[] tmp = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int leftProg = 100 - progresses[i];

            if (leftProg % speeds[i] == 0) leftDays[i] = leftProg / speeds[i];
            else leftDays[i] = leftProg / speeds[i] + 1;
        }

        System.out.println(Arrays.toString(leftDays));

        int idx = 0;
        int cnt = 1;
        int release = leftDays[0];

        for (int j = 0; j < leftDays.length - 1; j++) {
            if (release >= leftDays[j + 1]) {
                cnt++;
                continue;
            }

            tmp[idx++] = cnt;
            cnt = 1;
            release = leftDays[j + 1];
        }

        tmp[idx] = cnt;

        int[] answer = new int[idx + 1];

        for (int k = 0; k < answer.length; k++) {
            answer[k] = tmp[k];
        }

        return answer;
    }
}
