package chepter4.generic.test.ex3.unit;

public class ShuttleTestV2 {


	public static void main(String[] args) {


		ShuttleV2<BioUnit> shuttle1 = new ShuttleV2<>();

		shuttle1.in(new Marine("마린", 40));
		shuttle1.showInfo();

		shuttle1.in(new Zergling("저글링", 35));
		shuttle1.showInfo();

		shuttle1.in(new Zealot("질럿", 100));
		shuttle1.showInfo();

		shuttle1.in(new Zealot("질럿2", 150));
		shuttle1.showInfo();

		shuttle1.in(new Zealot("질럿2", 150));
		shuttle1.showInfo();
	}
}
