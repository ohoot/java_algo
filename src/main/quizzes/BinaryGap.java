package main.quizzes;

public class BinaryGap {
    public static void main(String[] args) {
        solution(51712);
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);

        int max = 0;
        int idx = 0;

        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && binary.charAt(i - 1) == '0') {
                int gap = i - idx - 1;
                if (gap > max) {
                    max = gap;
                }

                idx = i;
                continue;
            }

            if (binary.charAt(i) == '1') {
                idx = i;
            }
        }

        System.out.println(binary);
        System.out.println(max);

        return max;
    }
}
