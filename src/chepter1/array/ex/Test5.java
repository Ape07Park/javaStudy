package chepter1.array.ex;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {

        int sum = 0;
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

        scanner.close();

        for (int i : arr) {
            sum += i;
        }

        System.out.println("합계: " + sum);
        System.out.println((double) sum / arr.length);


    }
}
