package day0712;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJList extends JFrame {

	public UseJList() {
		
		super("MVC Pattern이 도입된 클래스");
		
		//1. Model 생성
		DefaultListModel<String> dlmLunch = new DefaultListModel<String>();
		
		//2. View 생성 JList는 스크롤바가 없어서 JScrollPane을 붙여줘야된다.
		JList<String> jlLunch = new JList<String> (dlmLunch);
		
		//3. 값 사용
		// 값 추가 -> Model을 사용
		dlmLunch.addElement("지하식당");
		dlmLunch.addElement("백암왕순대");
		dlmLunch.addElement("그릴 645 - 제육, 닭");
		dlmLunch.addElement("호보식당 - 제육");
		dlmLunch.addElement("김천 - 푸드카페");
		dlmLunch.addElement("김난완 초밥");
		dlmLunch.addElement("백종원의 새마을 식당");
		
		
		dlmLunch.removeElementAt(2);
		
		//JList는 ScrollerBar가 없음
		JScrollPane jspCenter =  new JScrollPane(jlLunch); // has a 관계 
		jspCenter.setBorder(new TitledBorder("점심메뉴"));
		
		add("Center",jspCenter);
		
		setSize(300,300);
		setVisible(true);

		
		//값 얻기
		JOptionPane.showMessageDialog(this, dlmLunch.getElementAt(3));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

	public static void main(String[] args) {

		new UseJList();

	}

}
