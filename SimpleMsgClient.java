package day0724;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * 서버에 접속하여 서버에서 제공하는 메시지를 읽는 일
 * 
 * @author user
 *
 */
public class SimpleMsgClient {
	public SimpleMsgClient() throws IOException {

		// 2. 소켓 생성하여 서버에 접속
		String ip = JOptionPane.showInputDialog(
				"서버ip입력\n132,133,134,135,136,137,138,139,142,143,141,151,140,145,146,147,148,149,150,160", "143");
		Socket client = null;
		DataInputStream dis = null;// 메시지를 읽기위한 스트림
		DataOutputStream dos = null;// 메시지를 보내기 위한 스트림

		if (ip != null && !"".equals(ip)) {
			try {
				// 2. 소켓 생성하여 서버에 접속
				client = new Socket("192.168.10." + ip, 1025);
				System.out.println("서버에 접속하였습니다.");
				// 4. 서버에서 제공하는 메시지를 받기위한 스트림을 연결
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
				// 5. 메시지 받기
				String msg = dis.readUTF();
				String sendMsg = JOptionPane.showInputDialog(ip + "에서 수신한 메시지 : \n" + msg);
				dos.writeUTF("142이 보냄 :-)"+sendMsg);
				dos.flush();

				// 6. 연결 끊기
			} finally {
				if (dis != null) {
					dis.close();
					if (dos!=null) {dos.close();}
					if (client != null) {client.close();}
				}
			} // end finally
		}
	}

	public static void main(String[] args) {
		try {
			new SimpleMsgClient();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// main

}// class
