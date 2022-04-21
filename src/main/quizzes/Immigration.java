package main.quizzes;

import java.util.Arrays;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = 1;

        Arrays.sort(times);

        long left = 1;
        long right = n * times[times.length - 1];

        while (left <= right) {
            long mid = (left + right) / 2;
            int capacity = 0;

            for (int i = 0; i < times.length; i++) {
                capacity += mid / times[i];
            }

            if (capacity >= n) {
                right = mid - 1;
                answer = mid;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
