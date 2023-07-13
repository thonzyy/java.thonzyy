package day0713;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AdapterDesign extends JFrame {

	
	public AdapterDesign () {
			super("XxxAdapter class를 사용한 윈도우 이벤트 처리");
			AdapterEvent ae = new AdapterEvent(this); // has a 관계
			
			addWindowListener(ae);
			setSize(800,800);
			setVisible(true);
	}
	public static void main(String[] args) {

		
		new AdapterDesign();
		
		
	}

}
