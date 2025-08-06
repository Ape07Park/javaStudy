package chepter2.poly.ex2;

public class AniamlPolyMain1 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		Duck duck = new Duck();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);
		soundAnimal(duck);
	} 

	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound(); // 오버라이딩으로 인해 각 동물의 오버라이딩한 sound() 실행
		System.out.println(animal.name); // 필드는 오버라이딩 x. 따라서 animal 인스턴스의 필드 실행
		System.out.println("동물 소리 테스트 종료");
	}
}
