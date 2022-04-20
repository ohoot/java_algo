package main.quizzes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Uniform {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        Queue<Integer> queue = new LinkedList<>(Arrays.stream(reserve).boxed().collect(Collectors.toList()));

        int reserveCnt = 0;
        for (int i = 0; i < lost.length; i ++) {
            if (queue.peek() == null) break;

            int min = queue.peek();

            if (lost[i] - 1 <= min && lost[i] + 1 >= min) {
                reserveCnt++;
                queue.poll();
                continue;
            }

            if (lost[i] - 1 > min) {
                queue.poll();
            }

        }

        return n - (lost.length - reserveCnt);
    }
}
