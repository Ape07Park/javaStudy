package chepter4.generic.test.ex3.unit;

public class UnitPrinter {

	// 제네릭 메서드
	// 타입 추론 과정 필요
	public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {

		shuttle.showInfo();
	}

	// 와일드 카드
	public static void printV2(Shuttle<?> shuttle) {

		shuttle.showInfo();
	}


}
