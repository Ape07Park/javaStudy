package chepter3.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

	public static void main(String[] args) {

		// 모든 이넘 반환
		Grade[] values = Grade.values();

		System.out.println("values = " + Arrays.toString(values));

		for (Grade grade : values) {
			System.out.println("name = " + grade.name() + " , ordinal = " + grade.ordinal());
		}

		System.out.println("======================");

		String input = "GOLD";
		Grade grade = Grade.valueOf(input);
		System.out.println("grade = " + grade);
	}
}
