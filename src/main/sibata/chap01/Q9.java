package main.sibata.chap01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter last number");
        int b = scanner.nextInt();

        sumof(a, b);
    }

    private static void sumof(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("sum: " + sum);
    }
}
