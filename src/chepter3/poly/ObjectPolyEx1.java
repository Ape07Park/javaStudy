package chepter3.poly;

import chepter2.poly.ex2.Animal;

public class ObjectPolyEx1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();

		action(dog);
		action(car);

		System.out.println("================");


	}

	private static void action(Object obj) {

		// obj.sound() Object 타입이라 sound() x
		// obj.move() Object 타입이라 sound() x

		// 객체에 맞는 다운캐스팅
		if (obj instanceof Dog dog) {
			dog.sound();
		} else if (obj instanceof Car car) {
			car.move();
		}

	}
}
