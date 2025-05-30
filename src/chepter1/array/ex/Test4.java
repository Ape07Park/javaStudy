package chepter1.array.ex;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        int sum = 0;
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 5개를 입력하세요");


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
