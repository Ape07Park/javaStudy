package jungsuckbook.innerclass;

public class InnerEx3 {

	private int outerIv = 0;
	static int outerCv = 0;

	// instance inner class
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}

	// static inner class
	static class StaticInner {
		// Non-static field 'outerIv' cannot be referenced from a static context
		// int siv = outerIv;

		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;

		// local inner class
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;

			int liv3 = lv;
			int liv4 = LV;
		}
	}
}
