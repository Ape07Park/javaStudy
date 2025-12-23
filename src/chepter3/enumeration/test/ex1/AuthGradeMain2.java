package chepter3.enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

	public static void main(String[] args) {
		AuthGrade grade = null;
		Scanner scanner = new Scanner(System.in);

		System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] :");
		String gradeName = scanner.nextLine();

		try {

			 grade = AuthGrade.valueOf(gradeName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("종료");
			return;
		}

		System.out.println("당신의 등급은 " + grade.getDescription() + "입니다");

		System.out.println("==메뉴 목록==");

		String[] menus = grade.getMenus();

		for (String menu : menus) {
			System.out.println("-" + menu);
		}

		scanner.close();
	}
}
