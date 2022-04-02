package chap05;

import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("int x: ");
        int x = scanner.nextInt();

        System.out.println("int y: ");
        int y = scanner.nextInt();

        System.out.println(gcd(x, y));
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
