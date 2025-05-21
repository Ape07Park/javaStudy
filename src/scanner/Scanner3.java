package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력:");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자 입력:");
        int num2 = scanner.nextInt();
        
        // 내가 두 수의 입력이 같을 경우는 생각 못하고 삼항연산자 사용함
        
        if ( num1 > num2 ) {
            System.out.println("더 큰 수 : " + num1);
        } else if (num1 < num2) {
            System.out.println("더 큰 수 : " + num2);
        } else {
            System.out.println("두 수의 크기가 같다");
        }
        
    }
}
