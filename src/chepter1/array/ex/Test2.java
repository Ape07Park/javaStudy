package chepter1.array.ex;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 5개를 입력하세요");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i : arr) {

            if (i == arr.length) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");

            }

        }

    }
}
