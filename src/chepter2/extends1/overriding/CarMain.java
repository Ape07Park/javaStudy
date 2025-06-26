package chepter2.extends1.overriding;

public class CarMain {
	public static void main(String[] args) {

		ElecticCar electicCar = new ElecticCar();
		electicCar.move();
		electicCar.charge();
		electicCar.openDoor();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();

		HydrogenCar hydrogenCar = new HydrogenCar();
		hydrogenCar.move();
		hydrogenCar.fillHydrogen();
		hydrogenCar.openDoor();
	}
}
