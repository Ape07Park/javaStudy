package chepter2.extends1.super1;

public class Child extends Parent {

	public String value = "child";

	@Override
	public void hello() {
		System.out.println("Child.hello");
	}

	public void call() {
		System.out.println("this value is " + this.value); // this 생략 O
		System.out.println("super value is " + super.value); // 부모 클래스의 주소값을 가리킴. 따라서 부모 클래스의 value를 가져옴

		this.hello();
		super.hello();
	}
}
