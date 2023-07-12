package day0712;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class TestBorder extends JFrame {

	public TestBorder() {

		super("보더의 연습");

		JPanel jpLeft = new JPanel();
		JPanel jpRight = new JPanel();

		JButton jbtnLeft = new JButton("왼쪽"); // 헝가리안 케이스
		JButton jbtnRight = new JButton("오른쪽"); // 헝가리안 케이스
		JButton jbtnRight2= new JButton("Right");
		
		jpLeft.add(jbtnLeft);
		jpRight.add(jbtnRight); // 패널에 들어가서 고유 크기가 있다.
		jpRight.add(jbtnRight2);
		//Border 설정
		
//		jpLeft.setBorder(new LineBorder(Color.RED));
         jpLeft.setBorder(new LineBorder(new Color(0x99004C))); //RGB COLOR
         
		jpRight.setBorder(new TitledBorder("버튼을 클릭해보세요"));

		setLayout(new GridLayout(1, 2));

		add(jpLeft);
		add(jpRight);

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new TestBorder();

	}

}
