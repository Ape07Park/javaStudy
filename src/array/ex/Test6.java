package array.ex;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        int max = 0;
        int min = 0;

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

        // 버블 정렬

        // 반복
        // max = getMax(a,b)


        scanner.close();

        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);


    }

    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        }

        return b;
    }
}
