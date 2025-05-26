package array.ex;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        int[] arr;
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 몇번 입력 할래요?");

        input = scanner.nextInt();

        arr = new int[input];

        System.out.println("숫자 입력 시작");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        // 큰 거 찾기
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }


        }


        scanner.close();

        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);


    }
}
