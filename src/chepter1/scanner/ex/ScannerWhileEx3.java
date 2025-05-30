package chepter1.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {

        int sum = 0;
        int inputCount = 0;
        int input = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력하시오. 0을 입력하면 중단");

       /* while (true) {

            int input = chepter1.scanner.nextInt();

            if (input == 0) {
                System.out.println("end");
                break;
            }

            sum += input;
            inputCount += 1;

        }*/

        while ((input = scanner.nextInt()) != 0){
            sum += input;
            inputCount += 1;
        }

        System.out.println(sum);
        System.out.println((double) sum / inputCount);


        // list를 사용해 푼 것
       /* List<Integer> arr = new ArrayList<>();
        

            System.out.print("숫자 입력(-1 입력 시 입력 종료:");

            // 반복문 돌면서 값을 arr에 넣기
            // 그 뒤 arr에서 값을 꺼내서 합과 평균계산

            while (true){

                int i = chepter1.scanner.nextInt();

                if (i == -1) {
                    break;
                }
                arr.add(i);
            }

           for(int i : arr) {
               sum += i;
           }

        System.out.println("합계는 " + sum);

           avg = (double) sum / arr.size();

        System.out.println("평균은 " + avg);*/


    }
}
