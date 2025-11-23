package jungsuckbook.lang.clone;

/**
 * clone() 사용할려면 Cloneable 구현 필수
 */
public class Point implements Cloneable {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point{" +
			"x=" + x +
			", y=" + y +
			'}';
	}

	@Override
	public Object clone() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
