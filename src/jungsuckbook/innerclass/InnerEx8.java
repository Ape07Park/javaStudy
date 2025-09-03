package jungsuckbook.innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {

	public static void main(String[] args) {

		Button b = new Button("start");
		// 익명 클래스를 의존성으로 넣은 것으로 익명 클래스는 선언과 동시에 할당됨
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action performed");
			}
		});
	}
}
