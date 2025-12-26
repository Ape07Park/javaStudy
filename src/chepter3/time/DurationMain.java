package chepter3.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DurationMain {

	public static void main(String[] args) {

		Duration duration = Duration.ofMinutes(30);
		System.out.println("duration = " + duration);

		LocalTime lt = LocalTime.of(1, 0);
		System.out.println("기준 시간 = " + lt);

		LocalTime plusTime = lt.plus(duration);
		System.out.println("더한 시간 = " + plusTime);

		//시간 차이
		LocalTime start = LocalTime.of(9, 0);
		LocalTime end = LocalTime.of(10, 0);

		Duration between = Duration.between(start, end); // 작은 거에서 큰 거 -> +
		Duration between2 = Duration.between(end, start); // 큰 거에서 작은 거 -> -

		System.out.println("차이: " + between.getSeconds() + "초");
		System.out.println("근무 시간: " + between.toHours() + "시간 " +
			between.toMinutesPart() + "분");

		System.out.println("차이: " + between2.getSeconds() + "초");
		System.out.println("근무 시간: " + between2.toHours() + "시간 " +
			between2.toMinutesPart() + "분");

	}
}
