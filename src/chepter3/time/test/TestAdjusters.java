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

		LocalDateTime date = LocalDateTime.of(year, month, 1, 0, 0, 0);


		// TODO 요일 추출 필요
		System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));


	}
}
