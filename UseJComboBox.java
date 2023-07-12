package day0712;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJComboBox extends JFrame {
	
	public UseJComboBox() {
		
		
		super("MVC Pattern 이 도입된 클래스");
		
		//1.Model 클래스 생성
		
		DefaultComboBoxModel<String> dcbmName = new DefaultComboBoxModel<String>();
		

		
		

		//2. View 클래스를 생성
		
		JComboBox<String>jcbName = new JComboBox<String>(dcbmName);
		
		
		
		//3. Model을 사용하여 데이터를 추가
		
		dcbmName.addElement("강다연");
		dcbmName.addElement("김다영");
		dcbmName.addElement("김선경");
		dcbmName.addElement("김인영");
		dcbmName.addElement("홍길동");
		
		setTitle("MVC Pattern이 도입된 클래스 데이터의 수 "+ dcbmName.getSize()+"개");
		
	//값 삭제
		//홍길동과 같은 값을 삭제
		
		dcbmName.removeElement("홍길동");
	//view에서 인덱스를 얻어서 삭제
		/*
		 * 
		 * dcbmName.removeElementAt(jcbName.getSelectedIndex());
		 */
		jcbName.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) { // 어나니머스 이너클래스 로 만든 값얻기
				//인덱스는 뷰에서 얻고 값은 모델에서 얻는다.
				String name = dcbmName.getElementAt(jcbName.getSelectedIndex());
//				JOptionPane.showMessageDialog(null, jcbName.getSelectedIndex()+"번째");
				JOptionPane.showMessageDialog(null, name+"님 안녕하세요?");
				
		}
	});
		
		
		JPanel jpNorth = new JPanel();
		
		jpNorth.setBorder(new TitledBorder("이름들"));
		
		jpNorth.add(jcbName);
		
		add("North",jpNorth);
		
		setSize(800,200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		dcbm.addElement("값");
	}

	public static void main(String[] args) {
		
		new UseJComboBox();

	}

}
