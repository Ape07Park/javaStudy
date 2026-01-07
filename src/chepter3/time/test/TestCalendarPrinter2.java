package chepter3.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("년도를 입력하시오 :");
		int year = scanner.nextInt();

		System.out.println("월을 입력하시오 :");
		int month = scanner.nextInt();

		printCalendar(year, month);

		scanner.close();

	}

	public static void printCalendar(int year, int month) {

		LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

		LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

		//월요일=1(1%7=1), ... 일요일=7(7%7=0)
		int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

		System.out.println("Su Mo Tu We Th Fr Sa ");

		//
		for (int i = 0; i < offsetWeekDays; i++) {
			System.out.print("   ");
		}

		LocalDate dayIterator = firstDayOfMonth;

		// 2월 되기 전까지 반복
		while (dayIterator.isBefore(firstDayOfNextMonth)) {

			System.out.printf("%2d ", dayIterator.getDayOfMonth());

			// 토요일이면 한칸 뛰기
			if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
				System.out.println();
			}

			dayIterator = dayIterator.plusDays(1);
		}

	}
}
