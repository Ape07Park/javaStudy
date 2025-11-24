package jungsuckbook.lang.clone;

public class CloneEx {

	public static void main(String[] args) {

		Point original = new Point(3, 5);

		Point copy = (Point)original.clone(); // 얕은 복사(값만 복사)로 객체 생성
		System.out.println(original);
		System.out.println(copy);

	}
}
