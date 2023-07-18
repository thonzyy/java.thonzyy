package kr.co.sist.meun;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	
	public JavaMemo() {
		
		JMenuBar jmb = new JMenuBar () ;
		
		JMenu jm = new JMenu ("파일") ;
		JMenu jm2 = new JMenu ("도움말") ;
		
		JMenuItem jmi1 = new JMenuItem("새글");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		JMenuItem jmi4 = new JMenuItem("종료");
		JMenuItem jmi5 = new JMenuItem("메모장정보");
		
		JTextArea jta = new JTextArea();
		JTextArea jta2 = new JTextArea();
		
		
		jta.setWrapStyleWord(true);
		jta.setLineWrap(true);
		
		jta2.setWrapStyleWord(true);
		jta2.setLineWrap(true);
		
		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jsp2 = new JScrollPane(jta2);
		
		jm.add(jmi1);
		jm.addSeparator();
		jm.add(jmi2);
		jm.add(jmi3);
		jm.addSeparator();
		jm.add(jmi4);
		jm2.add(jmi5);
		
		
		jmb.add(jm);
		jmb.add(jm2);
		setLayout(new GridLayout(1,2));
		
		add(jsp);
		add(jsp2);
		
		setJMenuBar(jmb);
		
		setBounds(100,100, 1000, 600);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
		
		
		
		
		
		
		
		
	
		
	}



}
