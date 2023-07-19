package day0719;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FileCopy extends JFrame implements ActionListener {
	private JLabel jlblOutput;
	private JProgressBar jpb;
	int value;
	
	public FileCopy() {
		super("파일복사");
		
		jpb = new JProgressBar();
		
		jlblOutput = new JLabel("출력창");
		jlblOutput.setBorder(new TitledBorder("출력창"));
		
		JButton jbtnFileSelect = new JButton("파일선택");
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new BorderLayout());
		
		jpCenter.add("North",jbtnFileSelect);
		jpCenter.add("South",jpb);
		
		jbtnFileSelect.addActionListener(this);
		
		add("Center",jpCenter);
		add("South",jlblOutput);
		
		setBounds(100,100,400,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//Filecopy
	
	public void selectFile() {
		FileDialog fdOpen = new FileDialog(this,"복사할 파일 선택",FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		if(path !=null) {
			jpb.setValue(0);
			value =0;
			 try {
	               fileCopy(path+name);
	               JOptionPane.showMessageDialog(this, "파일을 복사하였습니다.");
	            }catch (IOException e) {
	               JOptionPane.showMessageDialog(this,  "뎨둉합니다. \n파일을 복사하는 도중 문제 발생");
	               e.printStackTrace();
	            }

		}
	}
	
	private void fileCopy(String path)throws IOException {
		//1. 파일을 생성
		File originalfile = new File(path);
		//복사할 파일명을 원본파일명에 _bak 붙은 이름으로 생성
		//예) a.txt => a_bak.txt
		StringBuilder tempPath = new StringBuilder(originalfile.getAbsolutePath());
		tempPath.insert(tempPath.lastIndexOf("."), "_bak");
		
		File copyfile = new File(tempPath.toString());
		
		FileInputStream fis=null;
		FileOutputStream fos = null;
		
		try {
		//2. 입력스트림을 생성
		fis = new FileInputStream(originalfile);
		//3. 출력스트림을 생성
		fos = new FileOutputStream(copyfile);
		//4. 파일에서 읽어들인 내용을 출력스트림을 통해 내보낸다.
		int readcnt=0;
		int cnt=0;
		byte[] readData= new byte[512]; // 읽어들인 값을 저장할 배열
		
		while( (readcnt=fis.read(readData))!=-1 ) { // 방에 값을 저장하고, 저장한 방의 개수를 반환
			cnt++;
			fos.write(readData,0,readcnt);
		}
		System.out.println(cnt+"번 읽어들임");
		//5. 스트림의 내용을 분출
		fos.flush();
		}finally {
		//6. 연결 끊기
			if(fis!=null) {fis.close();}
			if(fos!=null) {fos.close();}
		}//end finally
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		selectFile();
		jpb.setValue(0);
		value = 0;
	}//actionPerformed

	public static void main(String[] args) {
		new FileCopy();
	}//main

}//class
