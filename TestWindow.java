package day0710;

import java.awt.Frame;
import java.awt.Window;


public class TestWindow extends Window {
	
	public TestWindow(Frame f) {
		super(f);
		f.setSize(400,400) ;
		f.setVisible(true); // 가시화 설정
		
	}

	public static void main(String[] args) {
		Frame f = new Frame("나는 프레임");
		
		 new TestWindow(f);

	}

}
