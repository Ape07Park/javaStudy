package jungsuckbook.innerclass.ex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex4 {

	public static void main(String[] args) {
		Frame f = new Frame();

		// 매개 변수를 내부 클래스로 생성해서 넣기
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}



