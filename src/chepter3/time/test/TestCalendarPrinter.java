package chepter3.time.test;

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

		LocalDate localDate = LocalDate.of(year, month, 1);

		LocalDate first = localDate.with(TemporalAdjusters.firstDayOfMonth());

		LocalDate last = localDate.with(TemporalAdjusters.lastDayOfMonth());

		Period between = Period.between(first, last);
		int period = between.getDays() + 1;

		System.out.println(period);

		for (int i = 1; i <= period; i++) {

			//

			System.out.println(i);
		}

		scanner.close();

	}
}
