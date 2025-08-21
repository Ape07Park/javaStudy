package chepter3.poly;

public class ObjectPolyEx2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();

		Object obj = new Object();

		Object[] objects = { dog, car, obj };

		Object[] objects2 = new Object[3];
		objects2[0] = dog;
		objects2[1] = car;
		objects2[2] = obj;

		size(objects);
	}

	private static void size(Object[] objects) {
		System.out.println("전달된 객체의 수는: " + objects.length);
	}
}
