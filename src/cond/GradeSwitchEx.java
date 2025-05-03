package cond;

import java.util.Scanner;

public class GradeSwitchEx {

    public static void main(String[] args) {
        String grade;
        Scanner scanner = new Scanner(System.in);

        grade = scanner.nextLine();

        switch (grade) {
            case "A":
                System.out.println("탁월");
                break;
            case  "B":
                System.out.println("훌륭");
                break;
            case  "C":
                System.out.println("준수");
                break;
            case  "D":
                System.out.println("합격");
                break;
            case  "E":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 값 입력함");
        }

    }
}
