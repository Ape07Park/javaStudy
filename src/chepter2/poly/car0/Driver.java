package chepter2.poly.car0;

public class Driver {

	// Driver가 setK3Car를 통해 k3Car를 알 수 있음
	private K3Car k3Car; // 참조형의 기본값은 null

	private Model3Car model3Car;

	public void setK3Car(K3Car k3Car) {
		this.k3Car = k3Car;
	}

	// 추가한 것
	public void setModel3Car(Model3Car model3Car) {
		this.model3Car = model3Car;
	}

	public void drive() {
		System.out.println("자동차 운전");

		if (k3Car != null) {
			k3Car.startEngine();
			k3Car.pressAccelerator();
			k3Car.offEngine();
		} else if (model3Car != null) {
			model3Car.startEngine();
			model3Car.pressAccelerator();
			model3Car.offEngine();
		}
	}
}
