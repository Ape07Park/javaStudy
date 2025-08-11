package chepter2.poly.car1;

/**
 * 자동차를 사용하는 클라이언트에 해당한다
 * 따라서 Driver 코드는 변경이 없음
 */
public class Driver {

	private Car car;

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		System.out.println("자동차를 설정 :" + car);
		this.car = car;
	}

	public void drive() {
		System.out.println("자동차 운전");

		car.startEngine();
		car.pressAccelerator();
		car.offEngine();
	}
}
