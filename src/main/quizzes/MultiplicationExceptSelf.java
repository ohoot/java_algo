package main.quizzes;

import java.util.Arrays;

public class MultiplicationExceptSelf {
    public static void main (String[] args) {
        int[] input  = {1, 2, 3, 4};
        int[] result = new int[input.length];

        Arrays.fill(result, 1);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i == j) continue;

                result[i] = result[i] * input[j];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
