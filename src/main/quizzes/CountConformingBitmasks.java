package main.quizzes;

import java.util.HashSet;
import java.util.Set;

public class CountConformingBitmasks {
    public static void main (String[] args) {
        int a = 1073741727;
        int b = 1073741631;
        int c = 1073741679;

        System.out.println(solution(a, b, c));
    }

    // Wrong Solution
    public static int solution(int A, int B, int C) {
        String bA = Integer.toBinaryString(A);
        String bB = Integer.toBinaryString(B);
        String bC = Integer.toBinaryString(C);

        int max = Math.max(bA.length(), Math.max(bB.length(), bC.length()));
        int min = Math.min(bA.length(), Math.min(bB.length(), bC.length()));

        String filledA = bA;
        String filledB = bB;
        String filledC = bC;

        if (bA.length() != max) filledA = fillEmpty(bA, max);
        if (bB.length() != max) filledB = fillEmpty(bB, max);
        if (bC.length() != max) filledC = fillEmpty(bC, max);

        Set<Integer> set = new HashSet<>(max);

        for (int i = min; i < max; min++) {
            set.add(i);
        }

        for (int j = max - min; j < max; j++) {
            if (filledA.charAt(j) == '0') set.add(j);
            if (filledB.charAt(j) == '0') set.add(j);
            if (filledC.charAt(j) == '0') set.add(j);
        }

        return set.size() * 2;
    }

    public static String fillEmpty(String str, int max) {
        StringBuilder sb = new StringBuilder(max);
        for (int i = str.length(); i < max; i++) {
            sb.append("0");
        }

        sb.append(str);

        return sb.toString();
    }
}
