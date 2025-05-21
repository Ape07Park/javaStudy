package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("hello\n"); // println과 같음
        System.out.println("world\n");

        System.out.print("문자열을 입력하시오:");

        // scanner.nextLine()을 만나면 멈춰서 사용자 입력을 기다림 - 사용자가 입력하면 입력을 읽어서 str에 넣음
        String str = scanner.nextLine(); // 입력받은 걸 str에 넣음.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println(doubleValue);
    }
}
