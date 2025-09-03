package jungsuckbook.innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {

	public static void main(String[] args) {
		Button b = new Button("start");
		// 익명 클래스 생성해서 의존성 넣기
		b.addActionListener(new EventHandler());
	}
}

class EventHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("Action performed");
	}
}

