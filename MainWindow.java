package day0713;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener{
	
	public MainWindow () {
		super ("자식창 띄우기") ;
		JButton jbtnOpenWin = new JButton("자식창을 띄웁니다");
		
		//글꼴변경
		//1.Font 생성
		
		Font font = new Font ("휴먼편지체", Font.ITALIC| Font.BOLD, 25) ;
		
		//컴포넌트에 적용
		jbtnOpenWin.setFont(font);
		
		//글자의 색 변경
		jbtnOpenWin.setForeground(Color.RED);
		jbtnOpenWin.setBackground(Color.GRAY);
		
		jbtnOpenWin.addActionListener(this); // xxxlistener 이벤트 등록 
		add(jbtnOpenWin);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		 new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new SubWindow(this);
	}

}
