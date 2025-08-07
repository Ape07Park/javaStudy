package chepter2.poly.ex6;

/**
 * LiveStock extends Egg
 * Fly는 그냥 interface
 *
 */
public class Chicken extends AbstractAnimal implements Fly, LiveStock{

	@Override
	public void sound() {
		System.out.println("꼬끼오");
	}

	@Override
	public void lay() {
		System.out.println("알 낳기");
	}

	@Override
	public void fly() {
		System.out.println("닭이 난다");
	}

	@Override
	public void eatGrain() {
		System.out.println("사람이 주는 곡식 먹기");
	}
}
