package chepter4.generic.test.ex3.unit;

public class Shuttle <T extends BioUnit> {

// 바이오 유닛 넣기

	private T unit;

	public void in(T unit) {
		this.unit = unit;
	}

	public void showInfo () {
		System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
	}
}
