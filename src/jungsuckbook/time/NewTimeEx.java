package jungsuckbook.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NewTimeEx {

	public static void main(String[] args) {


		LocalDate birthdate = LocalDate.of(1999, 12, 31);
		LocalTime birthTime = LocalTime.of(23,59,59);

		System.out.println(birthdate.withYear(2000)); // 2000-12-31
		System.out.println(birthdate.plusDays(1));// 2000-01-01

		// date를 plus하되 정해진 규격에 따라 날짜 +함
		System.out.println(birthdate.plus(1, ChronoUnit.DAYS));

		// System.out.println(birthdate.plus(1, ChronoUnit.HOURS)); // Date만 담을 수 있는 곳에 시, 분을 담을려해서 에러 발생: UnsupportedTemporalTypeException(Unsupported unit: Hours)

		System.out.println("---------- 실험 ----------");

		LocalDate birthdate2 = birthdate.plusYears(5);

		System.out.println(birthdate2);

		// +100년
		System.out.println(birthdate2.plus(1, ChronoUnit.CENTURIES));

	}
}
