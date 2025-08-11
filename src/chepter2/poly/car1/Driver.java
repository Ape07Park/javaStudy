package chepter2.poly.car1;

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
