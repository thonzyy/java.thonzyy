package day0719;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class UseFileOutputStream {

	public void useFileOutputStream() throws IOException {
		// 1. File을 생성
		File file = new File("d:/dev/temp/my_data.txt");
		// 2. 스트림 연결
		FileOutputStream fos = null;
		try {
		fos	= new FileOutputStream(file);
		// 3. 스트림에 데이터 쓰기
//		int data = 65;
//		fos.write(data);// 기본형을 쓰는 경우 flush를 하지 않아도 목적지로 분출된다.

//		byte[] data = {65,66,67};
//		fos.write(data);
		
		byte[] data = "오전시간은 Stream에 대해서 배웠습니다.".getBytes();
		fos.write(data);
 		// 4. 스트림에 데이터를 목적지로 분출
		fos.flush();
		} finally {
			// 5. 연결 끊기
			if(fos != null) {fos.close();}
		}
		
	}
	
	public void combinationStream() throws IOException{
		// 1. 파일생성
		File file = new File("d:/dev/temp/string_write.txt");
		// 파일이 존재하는지 물어보고 파일이 없다면 파일을 생성하고,
		// 파일이 존재한다면 덮어 쓸것인지 물어본 후 (confirmDialog)
		// "예"가 눌리면 덮어쓰고 "아니요"나 "취소"가 눌리면 파일쓰기를 하지 않는다.
		boolean writeFlag = false;
		
		if (file.exists()) {
			switch (JOptionPane.showConfirmDialog(null, file.getName() + "이 존재합니다. 덮어 쓰기겠습니까?")) {
			case JOptionPane.OK_OPTION:
				writeFlag = true;
			}
		}else {
			writeFlag = true;
		}
		
		if( writeFlag ) {
		OutputStreamWriter osw = null;
		try {
		// 2. 스트림 연결
			osw = new OutputStreamWriter(new FileOutputStream(file)); 
		// 3. 스트림에 데이터를 기록
			String msg ="오전에 공부하시느라 수고하셨고, 점심 맛있게드세요! ^o^";
			osw.write(msg);
		// 4. 목적지로 분출
			osw.flush();
		}finally {		
		// 5. 연결 끊기
			if(osw != null) {osw.close();}
		}
		}
	}
	
	public static void main(String[] args) {
		UseFileOutputStream ufos = new UseFileOutputStream();
		try {
//			ufos.useFileOutputStream();
			ufos.combinationStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
