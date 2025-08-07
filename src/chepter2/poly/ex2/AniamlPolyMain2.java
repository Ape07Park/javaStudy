package chepter2.poly.ex2;

public class AniamlPolyMain2 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		// 아래도 가능
		// Animal dog = new Dog();
		// Animal cat = new Cat();
		// Animal cow = new Cow();

		Animal[] animals = {dog, cat, cow};

		// 변하지 않는 부분
		 for (Animal animal : animals) {
			 System.out.println("동물 소리 테스트 시작");
			 animal.sound(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
			 System.out.println("동물 소리 테스트 종료");
		 }

	} 


}
