package main.quizzes;

public class Fibonacci {
    static int[] container;

    public static void main(String[] args) {
        int idx = 50;
        container = new int[idx];

        System.out.println(fibo(idx));
    }

    public static int fibo(int i) {
        if (i == 1 || i == 2) return 1;
        if (container[i - 1] != 0) return container[i - 1];

        return container[i - 1] = fibo(i - 1) + fibo(i - 2);
    }


}
