package array.ex;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        int[][] arr = new int[4][3];
//        int input = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력 시작");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + 1 + "번 학생의 성적을 입력하시오");
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("국어 점수 :" + arr[i]);
            System.out.println("영어 점수 :" + arr[i]);
            System.out.println("수학 점수 :" + arr[i]);

            System.out.println();
        }


    }
}
