package cond;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
       int a;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();

        String determined = ((a % 2) == 0) ? "짝수" : "홀수";
        System.out.println("determined : " + determined);
    }
}
