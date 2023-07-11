package day0711;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseJscrollPane extends JFrame {
	public UseJscrollPane() {
		
		super ("JScrollPane연습"); 
		
		JTextArea jta = new JTextArea();
		JTextArea jta2 = new JTextArea();
		JTextArea jta3 = new JTextArea();
		
		//입력 문자열을 줄 단위로 처리
		jta3.setLineWrap(true);
		//입력 문자열에 대해 단어로 보호 ( 단어를 인식하지는 않고 띄어쓰기를 단어로 인식)
		//한글은 안됨.
		jta3.setWrapStyleWord(true);
		
		//Container Component인 JScrollPane 생성
		
		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jsp2 = new JScrollPane(jta3);
		
		setLayout(new GridLayout(1,3));
		
		
		
		add(jsp);
		add(jta2);
//		add(jta3);// 컴포넌트를 붙이면 스크롤바가 나오지 않는다.
		
		//횡 스크롤바가 없어도 되는 상황은 줄보호를 이용한다.
		add(jsp2);
		setBounds(200,100,600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new UseJscrollPane();

	}

}
