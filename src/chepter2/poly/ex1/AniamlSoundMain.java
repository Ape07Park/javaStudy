package chepter2.poly.ex1;

public class AniamlSoundMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		// Cow[] cowArr = {dog, cat, caw}; // 타입이 달라서 배열에 넣기 불가

		System.out.println("동물 소리 테스트 시작");
		dog.sound();
		System.out.println("동물 소리 테스트 종료");

		System.out.println("동물 소리 테스트 시작");
		cat.sound();
		System.out.println("동물 소리 테스트 종료");

		soundCow(cow);
		// soundCow(cat); // 타입이 달라서 실행 x, 따라서 문제해결 아님, 동물이 추가될 때마다 계속 메서드 추가해야함
	} 

	private static void soundCow(Cow cow) {
		System.out.println("동물 소리 테스트 시작");
		cow.sound();
		System.out.println("동물 소리 테스트 종료");
	}
}
