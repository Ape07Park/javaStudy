package chepter1.array.ex;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 5개를 입력하세요");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");

            }

        }

    }
}
