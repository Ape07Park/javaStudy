package chepter2.extends1.ex2;

public class CarMain {
	public static void main(String[] args) {

		ElecticCar electicCar = new ElecticCar();
		electicCar.move();
		electicCar.charge();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}
