package chepter2.poly.ex6;



public class SoundFlyMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();

		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);

		chicken.eatGrain();
		chicken.lay();

		flyAnimal(bird);
		flyAnimal(chicken);

	}

	// 변하지 않는 부분
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
		System.out.println("동물 소리 테스트 종료");
	}

	// Fly 인터페이스가 있으면 사용 O
	private static void flyAnimal(Fly animal) {

		System.out.println("동물 날기 테스트 시작");
		animal.fly(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
		System.out.println("동물 날기 테스트 종료");
	}
}
