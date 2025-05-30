package chepter1.scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력:");
        int number = scanner.nextInt();

        System.out.println((number % 2 == 0) ? "짝수" : "홀수");
    }
}
