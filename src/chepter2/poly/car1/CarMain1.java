package chepter2.poly.car1;



public class CarMain1 {

	public static void main(String[] args) {

		Driver driver = new Driver();

		// k3 선택
		K3Car k3car = new K3Car();
		driver.setCar(k3car);
		driver.drive();

		// 차량 번경 k3 -> model3
		Model3Car model3Car = new Model3Car();
		driver.setCar(model3Car);
		driver.drive();

		NewCar newCar = new NewCar();

		//
		// chepter2.poly.car0.Model3Car model3Car = new Model3Car();
		// driver.setK3Car(null);
		// driver.setModel3Car(model3Car);
		// driver.drive();
	}
}
