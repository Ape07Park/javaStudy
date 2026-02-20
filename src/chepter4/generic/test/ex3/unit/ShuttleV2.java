package chepter4.generic.test.ex3.unit;

public class ShuttleV2<T extends BioUnit> {

	private final int MAX_UNIT = 4;

	private final BioUnit[] unit;

	private int currentSize = 0;

	ShuttleV2() {
		unit = new BioUnit[MAX_UNIT];
	}

	public void in(T unit) {

		if (currentSize == MAX_UNIT) {
			System.out.println("탑승 불가");
		} else {

			this.unit[currentSize] = unit;
			currentSize++;

		}

	}

	public void showInfo() {

		for (int i = 0; currentSize > i; i++) {

			System.out.println("이름 : " + unit[i].getName() + ", HP : " + unit[i].getHp());
		}

		System.out.println("END");

	}
}
