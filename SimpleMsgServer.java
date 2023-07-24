package day0724;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * 접속자가 접속하면 메시지를 출력하고 연결을 끊는다.
 * @author user
 *
 */
public class SimpleMsgServer {
	
	public SimpleMsgServer () throws IOException {
		//1. 서버소켓 열기
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		

		
		
		try { server= new ServerSocket(1025); // 무조건 종료가 되게끔
		System.out.println("서버가 실행되었습니다.");
		while (true) {
			//3.접속자가 접속하면
			client=server.accept();
			System.out.println("접속자가 접속하였습니다");
			//4. 데이터를 보내기위한 스트림을 연결
			dos= new DataOutputStream(client.getOutputStream());
			//접속자에게 제공할 메시지 만들기
			String msg = "안녕하세요 이동원의 컴퓨터입니다. 반갑습니다.";
			//5. 데이터를 스트림에 기록
			dos.writeUTF(msg);
			//6. 스트림에 기록된 내용을 목적지로 분출
			dos.flush();
			//클라이언트가 보내오는 메시지 읽기
			dis= new DataInputStream(client.getInputStream());
			JOptionPane.showMessageDialog(null,dis.readUTF());
			
			
		}//while
	
		} finally { 
			//7. 연결 끊기
			if (dos != null ) {dos.close();}
			if (dis != null ) {dis.close();}
			if (client != null ) {dos.close();}
			if (server != null ) {dos.close();}
			
			
		}
		
	
	}

	public static void main(String[] args) {
		try {
			new SimpleMsgServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
