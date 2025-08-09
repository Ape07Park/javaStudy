package chepter2.poly.car0;

public class Driver {

	// Driver가 setK3Car를 통해 k3Car를 알 수 있음
	private K3Car k3Car; // 참조형의 기본값은 null

	public void setK3Car(K3Car k3Car) {
		this.k3Car = k3Car;
	}

	public void drive() {
		System.out.println("자동차 운전");
		k3Car.startEngine();
		k3Car.pressAccelerator();
		k3Car.offEngine();
	}
}
