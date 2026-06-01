package chepter3.time.test2;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하시오 :");
       int year = scanner.nextInt();

        System.out.println("월을 입력하시오 :");
       int month = scanner.nextInt();



       // LocalDate startDate = LocalDate.of(year, month, 1);
       //
       // // 마지막 달의 일 추출
       // LocalDate endDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
       //
       //  // 시작일과 종료일 사이의 간격을 알아내서 loop
       //  Period between = Period.between(startDate, endDate);
       //
       //  System.out.println(between);
       //
       //  int days = between.getDays() + 1;
       //  System.out.println(days);
       //
       //  for (int i = 0; i < arr.length; i++) {
       //      System.out.print(arr[i] + " ");
       //  }
       //
       //  System.out.println();
       //
       //  for (int i = 0; i < days; i++) {
       //
       //      // 요일에 맞게 하기
       //
       //      // Su Mo Tu We Th Fr Sa
       //      // 1 2 3 4
       //      // 5 6 7 8 9 10 11
       //
       //      System.out.print(i + 1);
       //
       //      if (i % 7 == 6) {
       //          System.out.println();
       //      } else {
       //          System.out.print(" ");
       //      }
       //
       //  }

        printCalender(year, month);

       scanner.close();



    }

    private static void printCalender(int year, int month) {

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 월요일 = 1(1%7=1) ... 일요일 7(7%7=0)
        // 요일을 알아내서 달력에서 몇 칸을 띄울지 판별
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");

        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            if (dayIterator.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);

        }




    }

}
