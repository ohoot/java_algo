package main.quizzes;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                Arrays.stream(scoville).boxed().collect(Collectors.toList())
        );

        while (true) {
            int min = heap.poll();
            if (min >= K) break;

            Integer second = heap.poll();
            if (second == null) {
                answer = -1;
                break;
            }

            if (min == 0 && second == 0) {
                answer = -1;
                break;
            }

            heap.offer(min + second * 2);

            answer++;
        }

        return answer;
    }
}
