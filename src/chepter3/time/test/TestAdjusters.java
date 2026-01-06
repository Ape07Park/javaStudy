package chepter3.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

	public static void main(String[] args) {

		int year = 2024;
		int month = 1;

		// 코드 작성

		LocalDate date = LocalDate.of(year, month, 1);
		DayOfWeek firstDayOfWeek = date.getDayOfWeek();
		DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

		System.out.println(date.getDayOfWeek());
		System.out.println(firstDayOfWeek);
		System.out.println(lastDayOfWeek);


	}
}
