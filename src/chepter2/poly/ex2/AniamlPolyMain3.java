package chepter2.poly.ex2;

public class AniamlPolyMain3 {

	public static void main(String[] args) {

		// 아래도 가능
		// Animal dog = new Dog();
		// Animal cat = new Cat();
		// Animal cow = new Cow();

		Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

		// 변하지 않는 부분
		 for (Animal animal : animals) {
			 soundAnimal(animal);
		 }
	}

	// 변하지 않는 부분
	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
		System.out.println("동물 소리 테스트 종료");
	}

}
