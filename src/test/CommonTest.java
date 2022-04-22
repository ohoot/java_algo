package test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonTest {
    @Test
    public void test() {
        int[] test = {1, 2, 3 ,4, 5};

        System.out.println(Arrays.toString(Arrays.copyOfRange(test, 1, 5)));

    }
}
