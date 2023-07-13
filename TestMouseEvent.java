package day0713;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

/**
 * 마우스 이벤트를 간단하게 처리하기 위해 MouseAdapter를 상속
 * 
 * @author user // * alt + shift + s
 */

public class TestMouseEvent extends MouseAdapter {
	// 인터페이스로 구현하면 모든 추상 메소드가 불려오기 떄문에
	// 어댑터로 필요한 메소드만 오버라이드한다.

	private TestMouseDesign tmd;// null - 객체가 생성되지 않았다.
	private JTextArea jta;

	/**
	 * TestMouseEvent 클래스가 생성될 때 TestMouseDesign객체를 입력받아 생성받아 (has a 관계)
	 * 
	 * @param tmd
	 */
	public TestMouseEvent(TestMouseDesign tmd) {
		this.tmd = tmd;

	}

//	@Override
//	public void mouseMoved(MouseEvent me) {
//		System.out.println("마우스가 움직였음");
//	}

	@Override
	public void mouseClicked(MouseEvent me) {
		String buttonType = "";

		switch (me.getButton()) {
		case MouseEvent.BUTTON1:
				buttonType = "왼쪽버튼";
			break;
		case MouseEvent.BUTTON2:
			buttonType = "가운데버튼";
			break;
		case MouseEvent.BUTTON3:
			buttonType = "오른쪽버튼";
			break;
		default:
			break;
		}

		tmd.getJta().setText(buttonType + "마우스 버튼이 클릭되었음");
		// 디자인 클래스에 겟터 메소드를 만들어서 접근한다.
	}

}
