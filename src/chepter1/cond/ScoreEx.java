package chepter1.cond;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {
       int score;
       Scanner scanner = new Scanner(System.in);

       score = scanner.nextInt();

       if (score >= 90) {
           System.out.println("A");
       } else if (score >= 80) {
           System.out.println("B");
       } else if (score >= 70) {
           System.out.println("C");
       } else if (score >= 60) {
           System.out.println("D");
       } else {
           System.out.println("F");
       }
    }
}
