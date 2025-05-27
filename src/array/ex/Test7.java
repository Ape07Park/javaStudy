package array.ex;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        int[][] arr = new int[4][3];
        Scanner scanner = new Scanner(System.in);
//        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "번 학생의 성적을 입력하시오");
            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0) {
                    System.out.print("국어 점수 :");
                    arr[i][j] = scanner.nextInt();
                } else if (j == 1) {
                    System.out.print("영어 점수 :");
                    arr[i][j] = scanner.nextInt();
                } else {
                    System.out.print("수학 점수 :");
                    arr[i][j] = scanner.nextInt();
                }

//                System.out.println(subjects[j] + " 점수를 입력하시오: ");
//                arr[i][j] = scanner.nextInt();

            }
        }

        scanner.close();

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < arr[i].length; j++) {

                sum = sum + arr[i][j];
                avg = (double) sum / (arr[i].length);
            }
            System.out.println(i + 1 + "번 학생의 성적 :" + sum + "평균 :" + avg);

            System.out.println();
        }

    }
}
