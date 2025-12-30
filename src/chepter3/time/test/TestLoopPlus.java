package chepter3.time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

	public static void main(String[] args) {

		LocalDateTime time1 = LocalDateTime.of(2024, 1, 1, 0, 0);
		LocalDate time2 = LocalDate.of(2024, 1, 1);

			// 2주 간격으로 5번 반복

		// 	Duration weeksDuration = ChronoUnit.WEEKS.getDuration();
		//
		//
		// for (int i = 1; i <= 5; i++) {
		// 	// time에 2주 더하기
		// 	// 축적
		//
		// 	LocalDate date = LocalDate.of(time1.getYear(), time1.getMonth(), time1.getDayOfMonth());
		// 	System.out.println("날짜 " + i + ": " + date);
		//
		// 	time1 = time1.plus(weeksDuration);
		// 	time1 = time1.plus(weeksDuration);
		//
		// }

		for (int i = 0; i < 5; i++) {
				LocalDate nextDate = time2.plus(2 * i, ChronoUnit.WEEKS);
			System.out.println("날짜 " + (i + 1) + ": " + nextDate);
		}





	}
}
