package chepter2.poly.ex5;

public class InterfaceMain {

	public static void main(String[] args) {

		// 인터페이스는 인스턴스 생성 불가
		// InterfaceAnimal animal = new InterfaceAnimal();

		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();

		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);

	}

		// 변하지 않는 부분
		private static void soundAnimal(InterfaceAnimal animal) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
			System.out.println("동물 소리 테스트 종료");
		}

		// 변하지 않는 부분
		private static void moveAnimal(InterfaceAnimal animal) {
			System.out.println("동물 이동 테스트 시작");
			animal.move(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
			System.out.println("동물 이동 테스트 종료");
		}
}
