package  kr.co.stst.memo;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class JavaMemoEvn extends WindowAdapter implements ActionListener {
	private JavaMemo jm;
	private FileDialog fd;
	private boolean flag;

	public JavaMemoEvn(JavaMemo jm) {
		this.jm = jm;
		flag = true;
	}// JavaMemoEvn

	// 메뉴바 새글 메소드
//	public void fileNew() {
//		jm.getJta().setText("");
//
//	}// fileNew

	// 메뉴바 열기 메소드
	public void fileOpen() {
		fd = new FileDialog(jm, "열기", FileDialog.LOAD);
		System.out.println("열기");
		fd.setVisible(true);
	}// fileOpen

	// 메뉴바 저장 메소드
	public void fileSave() {
		
		fd = new FileDialog(jm, "저장", FileDialog.SAVE);
		fd.setVisible(true);
	}// fileSave

	// 메뉴바 다른이름 저장 메소드
	public void fileNewSave() {
		fd = new FileDialog(jm, "다른이름 저장", FileDialog.SAVE);
		fd.setVisible(true);
	}// fileNewSave
	public void fileNew() {
	    String currentText = jm.getJta().getText();

	    // If the text area is not empty and there are changes, ask to save
	    if (!currentText.isEmpty()) {
	        int result = JOptionPane.showConfirmDialog(jm, "변경된 내용을 저장하시겠습니까?", "저장 확인", JOptionPane.YES_NO_CANCEL_OPTION);
	        if (result == JOptionPane.YES_OPTION) {
	            fileSave();
	        } else if (result == JOptionPane.CANCEL_OPTION) {
	            return; // Cancel the action
	        }
	    }

	    // Clear the text area to create a new memo
	    jm.getJta().setText("");
	    jm.setTitle("메모장 - 새글");
	}
	
	// 메뉴바 닫기 메소드
	public void memoClose() {
		jm.dispose();
	}// memoClose

	// 메뉴바 폰트 메소드
	public void font() {
		new JavaMemoFont(jm);

	}// font

	// 자동 줄바꿈 메소드
	public void wrap() {
		if (flag) {
			flag=false;
		}else {
			flag=true;
		}//end else
		jm.getJta().setLineWrap(!flag);
	}//wrap

	// 메뉴바 도움 메소드
	public void help() {
//		new JavaMemoInfo();
		Object[] options = { "닫기" };
		String info = "이 메모장은 자바언어로 만들어진\n메모장으로 License는\nPL(Public License)로 자유롭게\n배포하고 사용하실 수 있습니다.\n작성자 김주민";
		JOptionPane.showOptionDialog(jm, info, "메모장 정보", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
	}// help

	// 종료
	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 새글
		if (ae.getSource() == jm.getJmiNew()) {
			fileNew();

		} // end if

		// 닫기
		if (ae.getSource() == jm.getJmiClose()) {
			memoClose();
		} // end if

		// 열기
		if (ae.getSource() == jm.getJmiOpen()) {
			fileOpen();
		} // end if

		// 저장
		if (ae.getSource() == jm.getJmiSave()) {
			fileSave();
		} // end if

		// 다른이름 저장
		if (ae.getSource() == jm.getJmiNewSave()) {
			fileNewSave();
		} // end if

		// 폰트
		if (ae.getSource() == jm.getJmiFont()) {
			font();
		} // end if

		// 자동줄바꿈
		if (ae.getSource() == jm.getJmiWrap()) {
			wrap();
		} // end if

		// 도움말
		if (ae.getSource() == jm.getJmiHelp()) {
			help();
		} // end if

	}

}
