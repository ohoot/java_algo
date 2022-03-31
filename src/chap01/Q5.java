package chap01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int start = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = scanner.nextInt();
        double index = n / 2d;

        int result = (int)((start + n) * index);

        System.out.println("result: " + result);
    }
}
