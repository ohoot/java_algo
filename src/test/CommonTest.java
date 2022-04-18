package test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonTest {
    @Test
    public void test() {
        int[] arr = {};

        System.out.println(arr.length);
    }

    public int solution(int X, int Y, int D) {
        int distance = Y - X;

        if (distance % D == 0) return distance;

        return (Y - X) / D + 1;
    }

    int A[] = new int[5];

    Collectors

    Set<Integer> mySet = new HashSet<>(Arrays.asList(A));
    Set<Integer> hs = new HashSet<Integer>(Arrays.asList(A));

}
