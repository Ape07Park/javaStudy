package jungsuckbook.lang.clone;

public class Circle implements Cloneable {

	Point2 p;
	double r;

	public Circle (Point2 p, double r) {
		this.p = p;
		this.r = r;
	}

	/**
	 * 얕은 복사: 객체가 지닌 값만 복사하고 주소값은 원본 것을 공유
	 * @return
	 */
	public Circle shallowCopy() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {

		}
		return (Circle)obj;
	}

	/**
	 * 깊은 복사: 객체가 지닌 값만이 아니라 아예 새로운 객체를 생성해 주소값도 달라짐
	 * @return
	 */
	public Circle deepCopy() {

		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}

		// 새 객체 변수에 얕은 복사한 값 담기
		Circle c =  (Circle) obj;

		c.p = new Point2(this.p.x, this.p.y);
		return c;

	}

	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
}

class Point2 {
	int x;
	int y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}


class ShallowDeepCopy  {
	public static void main(String[] args) {

		Circle c1 = new Circle(new Point2(1,1), 2.0);

		Circle shallowed = c1.shallowCopy();

		Circle deeped = c1.deepCopy();

		System.out.println("c1 = " + c1);
		System.out.println("shallowed = " + shallowed);
		System.out.println("deeped = " + deeped);

		c1.p.x = 9;
		c1.p.y = 9;

		System.out.println("c1 변경 후");

		System.out.println("c1 = " + c1);
		System.out.println("shallowed = " + shallowed);
		System.out.println("deeped = " + deeped);

	}

}
