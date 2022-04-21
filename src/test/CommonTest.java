package test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CommonTest {
    @Test
    public void test() {
        int[] aa = new int[3];

        int i = 3;
        int j = i = aa[0] = 4;

        System.out.println(j);

    }

    @Test
    public int solution(int n, int[][] edge) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        Set<Integer> marks = new HashSet<>(edge.length);
        Map<Integer, Integer> map = new HashMap<>(n);

        int cnt = 0;

        while (!queue.isEmpty()) {
            int target = queue.poll();
            cnt++;

            for (int i = 0; i < edge.length; i++) {
                if (!marks.contains(i)) {
                    for (int j = 0; j < edge[i].length; j++) {
                        if (target == edge[i][j]) {
                            int next = 0;

                            if (j == 0) next = edge[i][1];
                            else next = edge[i][0];

                            queue.offer(next);
                            marks.add(i);

                            map.put(cnt, map.getOrDefault(cnt, 0) + 1);
                        }
                    }
                }
            }
        }

        return map.get(Collections.max(map.keySet()));
    }
}
