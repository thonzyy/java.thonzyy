package day0724;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Socket을 열어서 지정한 서버에 접속하는 일
 * @author user
 *
 */
public class TestSocket {
	public TestSocket() throws UnknownHostException, IOException {
		//1.Socket을 생성하여 서버에 접속
		Socket client = new Socket("192.168.10.143",65000); // 루프백
		System.out.println("클라이언트 생성");
	}//TestSocket

	public static void main(String[] args) {
		try {
			new TestSocket();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
