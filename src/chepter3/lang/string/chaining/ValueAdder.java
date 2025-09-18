package chepter3.lang.string.chaining;

public class ValueAdder {

	private int value;


	public ValueAdder add(int value) {
		this.value += value;

		// 자신의 주소값을 반환
		return this;
	}

	public int getValue() {
		return value;
	}
}
