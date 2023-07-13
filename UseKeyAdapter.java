package day0713;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseKeyAdapter extends JFrame {
	
	private JTextArea jta;
	private JTextField jtf;
	private UseKeyAdapter uka;
	
	public UseKeyAdapter( ) {
		super("키보드 이벤ㅌ ㅡ처리");
		
	      jtf = new JTextField(); // 지역변수는 노란색
	      jta = new JTextArea();
	      JScrollPane jspCenter = new JScrollPane(jta); // has a 관계
	      
	      jtf.setBorder(new TitledBorder("아무키나 누르고 엔터"));
	      jta.setBorder(new TitledBorder("눌린 키의 결과"));
	      
	      
	      add("North", jtf);
	      add("Center",jspCenter);
	      uka=this;
	      //이벤트 등록 : 어나니머스 이너 클래스 처리
	      jtf.addKeyListener(new KeyAdapter() {
		
			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				System.out.println("KeyTyped"+e.getKeyCode()+ " / "+ e.getKeyChar());
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("keyReleased"+e.getKeyCode()+ " / "+ e.getKeyChar()); // 튀어 오를 때
//			}
			
			@Override
			public void keyPressed(KeyEvent ke) {
//				System.out.println("keyPressed"+e.getKeyCode()+ " / "+ e.getKeyChar()); // 눌려질 때
				jta.append("눌린 키의 코드 : " +  ke.getKeyCode()+ ", 키 문자 : " + 
                                    ke.getKeyChar()+"\n"); // 키코드는 대문자 소문자 같다.
				jtf.setText(""); 
			
			      if (ke.getKeyCode()==27) {
			    	     uka.dispose(); // dispose는 JFrame에서 제공하는 method
			    	     //this 는 어디에서 사용되었느냐에 따라 달라집니다.
			    	     //어나니머스 이너 클래스에서 사용되면 키 어댑터이고
			    	     //생성자에서 사용되면 JFrame이 된다.
			    	     //외부 클래스(JFrame)의 자원을 사용하게 된다.
			    	     
			      }
			      
			}
		
		});
	      
	 
	      setBounds(100, 100, 350, 500);
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
		//인스턴스변수는 파란색
	}

	public static void main(String[] args) {
		new UseKeyAdapter();


	}

}
