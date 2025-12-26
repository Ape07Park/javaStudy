package chepter3.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

	public static void main(String[] args) {
		Period period = Period.ofDays(10);

		System.out.println(period);

		LocalDate currentDate = LocalDate.of(2030, 1,1);
		LocalDate plusDate = currentDate.plus(period);
		System.out.println("현재 날짜: " + currentDate);
		System.out.println("더한 날짜: " + plusDate);

		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 4, 2);

		Period between = Period.between(startDate, endDate); // 작은 거에서 큰 거 -> +
		Period between2 = Period.between(endDate, startDate); // 큰 거에서 작은 거 -> -

		System.out.println("기간 " + between.getMonths() + "개월 " + between.getDays() + "일"); // 기간 3개월 1일
		System.out.println("기간 " + between2.getMonths() + "개월 " + between2.getDays() + "일"); // 기간 -3개월 -1일


	}
}
