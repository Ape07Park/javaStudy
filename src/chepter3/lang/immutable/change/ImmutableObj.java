package chepter3.lang.immutable.change;

public class ImmutableObj {

	private final int value;

	public ImmutableObj(int value) {
		this.value = value;
	}

	// 불변 객체라 한번 값을 할당하면 변경 불가이니 아예 계산 결과를 새로운 객체에 담아서 반환
	public ImmutableObj add(int value) {
	return new ImmutableObj(this.value + value);}

	public int getValue() {
		return value;
	}
}
