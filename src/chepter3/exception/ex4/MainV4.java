package chepter3.exception.ex4;

import java.util.Scanner;

import chepter3.exception.ex3.exception.NetworkServiceV3_2;
import chepter3.exception.ex4.exception.SendExceptionV4;

public class MainV4 {

    public static void main(String[] args) {

        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);

            }
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다");

    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다"); // html 화면
        System.out.println("=개발자용 디버깅 메시지="); // 로그 파일
        e.printStackTrace(System.out); //  스택 트레이스 출력

        // 필요한 별도 예외 처리
        // 예외가 객체라는 점 이용함
        if(e instanceof SendExceptionV4 sendException) {
            System.out.println("[전송 오류] 전송 데이터 " + sendException.getSendData());
        }

    }
}
