package chepter3.lang.object.tostring;

public class ToStringMain2 {

	public static void main(String[] args) {
		Car car = new Car("BMW");
		Dog dog1 = new Dog("멍멍이1", 2);
		Dog dog2 = new Dog("멍멍이2", 4);

		System.out.println("1. 단순 toString 호출");
		System.out.println(car.toString()); // no Override
		System.out.println(dog1.toString()); // Override
		System.out.println(dog2.toString()); // Override

		System.out.println("2. println 내부에서 toString 호출");
		System.out.println(car);  // no Override
		System.out.println(dog1); // Override
		System.out.println(dog2); // Override

		System.out.println("3. Object 다형성 활용");
		ObjectPrinter.print(car);
		ObjectPrinter.print(dog1);
		ObjectPrinter.print(dog2);

		//
		// int i = Integer.toHexString(System.identityHashCode(dog1));
		// int i = Integer.toHexString(System.identityHashCode(dog1));

	}
}
