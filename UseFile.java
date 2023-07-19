package day0719;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseFile {
	
	/**
	 * 8bit와 16bit Stream을 사용하여 한글이 깨지지 않게 읽어들이기
	 * @throws IOException 
	 * @throws  
	 */
	public void useByteStream () throws IOException {
		//1 File 생성 
		File file = new File ("E:/dev/temp/java_read.txt");
//		File file = new File ("E:/dev/temp/img5.jpg");
		if (file.exists()) {
			BufferedReader br = null;
			try {
			//2 Stream을 연결
			 br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			//3 파일의 내용을 줄단위로 읽어들임
			String temp = "";
			while ((temp=br.readLine())!=null) {
				System.out.println(temp);
			}
			
			
			}finally { // 반드시 실행되야 되는 것
				//4 연결을 끊기 (가장 중요)
				
					if (br != null) {br.close();}
			
		}// end if
		
	}//useByteStream
	}
	
	public void useStringStream () throws IOException  {
		//1. 파일정보얻기
		File file = new File ("E:/dev/temp/java_read.txt");
		//파일이 존재하는지 물어보고 파일이 없다면 파일을 생성하고
		//파일이 존재한다면 덮어 슬것인지 물어본 후 
		//예가 눌리면 덮어쓰고, 아니오나 취소가 눌리면 파일쓰기를 하지 않는단ㄷ.
		
		
		if (file.exists()) {
			//2. 파일에 스트림 연결
			BufferedReader br = null;
			try {
			 br = new BufferedReader(new FileReader(file));
				//3. 파일의 내용을 줄단위로 읽기
			 String temp = "";
			 StringBuilder sbData = new StringBuilder();
			 while ( (temp= br.readLine())!=null) {
				sbData.append(temp).append("\n");
			}
			 JTextArea jta = new JTextArea(10,80);
			 jta.setText(sbData.toString());
			 JScrollPane jsp = new JScrollPane(jta);
			 JOptionPane.showMessageDialog(null, jsp);
			}finally {
				if (br != null) {br.close(); }
					
				}//end finally
			}//end if
			
		}//useStringStream
	
		//4. 연결 끊기
		

	public static void main(String[] args) {
	UseFile uf = new	UseFile();
	
	try {
		uf.useStringStream();
//		uf.useByteStream();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
