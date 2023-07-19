package day0719;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UseFileWriter {

	public UseFileWriter() throws IOException {

		// 1. 파일생성
		File file = new File("e:/dev/temp/write16.txt");

		// 2. 스트림을 연결
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			String data = "오늘은 수요일입니다.";
			// 3. 스트림에 쓰기
			fw.write(data);
			// 4. 스트림의 내용을 목적지로 분출
			fw.flush();
		} finally {
			// 5. 연결 끊기
			if (fw != null) {
				fw.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileWriter();
			System.out.println("파일에 기록하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
