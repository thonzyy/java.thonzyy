package day0710;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class NewScreen extends JFrame {
	
	public NewScreen () {
		super ("이동원의 전화번호 키패드");
		JButton jbtn1 = new JButton("1");
		JButton jbtn2 = new JButton("2");
		JButton jbtn3 = new JButton("3");
		JButton jbtn4 = new JButton("4");
		JButton jbtn5 = new JButton("5");
		JButton jbtn6 = new JButton("6");
		JButton jbtn7 = new JButton("7");
		JButton jbtn8 = new JButton("8");
		JButton jbtn9 = new JButton("9");
		JButton jbtn10 = new JButton("*");
		JButton jbtn11 = new JButton("0");
		JButton jbtn12 = new JButton("#");
		
		setLayout(new GridLayout(4,3));
		
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(jbtn5);
		add(jbtn6);
		add(jbtn7);
		add(jbtn8);
		add(jbtn9);
		add(jbtn10);
		add(jbtn11);
		add(jbtn12);
		
		setSize(500,500);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new NewScreen();
		

	}

}
