package day0711;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * Hungarian Notation
 * 컴포넌트의 종류 + 하는 일의 형식으로 이름을 부여할 수 있다.
 * jbtnInput
 * intAge
 * stringName
 * 여러개의 Layout을 복합하여 사용.
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. Window component 상속
public class ComplexLayout extends JFrame {
	
	public ComplexLayout () {
		super ("여러 레이아웃의 사용");
		
		//2. 컴포넌트 생성
		JLabel jlblName= new JLabel("이름");
		JTextField jftName = new JTextField(14);
		JComboBox<String> jcbClass = new JComboBox<String>();
		jcbClass.addItem("A 클래스");
		jcbClass.addItem("B 클래스");
		jcbClass.addItem("C 클래스");
		jcbClass.addItem("D 클래스");
		JButton jbtnAdd = new JButton("입력");
		JTextArea jtaNameDisp = new JTextArea();
		
		
		
		//3. 배치
		
		//패널에 배치
		JPanel jpNorth = new JPanel(); //FlowLayout 기본 설정
		jpNorth.add(jlblName);
		jpNorth.add(jftName);
		jpNorth.add(jcbClass);
		jpNorth.add(jbtnAdd);

	
		
		//Frame에 배치
		add("North", jpNorth);
		add("Center",jtaNameDisp);
		
		//4. 윈도우 크기를 설정
		setSize(450,400);
		//5. 가시화
		setVisible(true);
		//6. 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		;
		
		
	}//ComplexLayout

	public static void main(String[] args) {
		new ComplexLayout();

	}

}
