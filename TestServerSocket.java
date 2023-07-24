package day0724;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 실행되면 컴퓨터에 지정한 PORT를 열고, 접속자 Socket이 접속하기를
 * 대기하는 일.
 * @author user
 *
 */
public class TestServerSocket {
	
	public TestServerSocket() throws IOException {
		
		//1. 서버 소켓을 생성 : 지정한 PORT열림
		ServerSocket server = new ServerSocket(65000);
		System.out.println("서버 실행...중");
		//3. 접속자 소켓을 받는다.
		Socket client = server.accept();
		
		System.out.println("접속자가 접속하였습니다."+client.getInetAddress());
		
	}

	public static void main(String[] args) {

		try {
			new TestServerSocket();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
