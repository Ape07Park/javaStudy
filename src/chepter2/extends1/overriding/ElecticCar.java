package chepter2.extends1.overriding;

public class ElecticCar extends Car {

	public void charge() {
		System.out.println("충전합니다");
	}

	@Override
	public void move(){
		System.out.println("전기차가 빠르게 이동");
	}
}
