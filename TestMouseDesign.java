package day0713;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TestMouseDesign extends JFrame {
	private JTextArea jta;
	public TestMouseDesign() {
		super("마우스 이벤트");
		jta = new JTextArea();
		
		
		TestMouseEvent tme = new TestMouseEvent(this);
		jta.addMouseListener(tme);
		
		
		
		add(jta); // BorderLayout은 컴포넌트를 배치하는 위치를 설정하지 않으면 center에 배치
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	

	public JTextArea getJta() { // jta를 tme클래스에서 사용하고 싶을 때
		return jta;
	}





	public static void main(String[] args) {

		new TestMouseDesign();
		
	}

}
