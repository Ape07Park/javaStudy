package chepter3.time.test2;

import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하시오");
       int year = scanner.nextInt();

        System.out.println("월을 입력하시오");
       int month = scanner.nextInt();

       LocalDate localDate = LocalDate.of(year, month, 1);



       scanner.close();





    }

}
