package chepter3.lang.math;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		// 랜덤 돌리기 1~45로. 랜덤 돌리면서 그 뒤 배열에 넣기. 배열이랑 비교해서 같은 값 존재 시 다시 랜덤 돌리기
		int[] arr = new int[6];

		int num;

		for (int i = 0; i < arr.length; i++) {

			do {
				num = getRandom();
			} while (isSame(arr, num));

			arr[i] = num;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int getRandom() {
		Random random = new Random();
		return random.nextInt(1, 45);
	}

	public static boolean isSame(int[] arr, int target) {

		for (int i : arr) {
			if (i == target) {
				return true;
			}
		}
		return false;
	}
}
