package chap01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // 양의 정수 처리 하지 않음
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = scanner.nextInt();

        int len = 0;
        do {
            i = i / 10;
            len++;
        } while (i > 0);

        System.out.println("len: " + len);
    }


}
