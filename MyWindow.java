package day0703;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MyWindow extends Frame {
	private Button btn;

	public MyWindow() {
		super("이것은 윈도우?");

		btn = new Button("나는 버튼");

		add(btn);

		// anonymous inner class(클래스를 값으로 사용)로 윈도우 종료 이벤트 처리
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}
		});

		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MyWindow();

	}

}
