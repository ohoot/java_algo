package test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CommonTest {
    @Test
    public void test() {
        int[] A = {-3, 1, 2, -2, 5, 6};

        Map<Integer, Integer> map = new HashMap<>(A.length);

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }

        Integer[] boxed = Arrays.stream(A).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, Collections.reverseOrder());

        System.out.println(map);
        System.out.println(map.get(A[0]));

    }
}
