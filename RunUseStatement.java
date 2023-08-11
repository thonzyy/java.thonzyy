package kr.co.sist.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RunUseStatement {

	public void useCreateStudentTable () {
		UseStatementDAO usDAO = new UseStatementDAO();
		try {
			usDAO.createStudentTable();
			usDAO.createStudentTableIndex();
		} catch (SQLException e) {
			e.printStackTrace();
		}//END CATCH
	}//useCreateStudentTable
	
	public void useInsertStudent() {
		StudentVO sVO= new StudentVO(3,"박상준",25,"park@test.com",null);
		UseStatementDAO usDAO = new UseStatementDAO();
		try {
			usDAO.insertStudent(sVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}//END CATCH
	}//USEINSERTSTUDENT
	
	public void useupdatgeStudent() {
		StudentVO sVO= new StudentVO(2,"",0,"kang1@daum.net",null );
		UseStatementDAO usDAO = new UseStatementDAO();
		try {
			int cnt = usDAO.updateStudent(sVO);
			if(cnt==0) {
				System.out.println("학생의 번호를 확인해주세요");
			} else {
				System.out.println("학생 정보가 변경되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//END CATCH
	}//USEINSERTSTUDENT
	
	public void usedeleteStudent() {
		StudentVO sVO= new StudentVO(3,"박상준",24,"park@test.com",null );
		UseStatementDAO usDAO = new UseStatementDAO();
		try {
			
			usDAO.deleteStudent(sVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}//END CATCH
	}//USEINSERTSTUDENT

	public static void main(String[] args) {
		RunUseStatement rus=  new RunUseStatement();
//		rus.useCreateStudentTable();
		//rus.useInsertStudent();
		//rus.useupdatgeStudent();
		rus.usedeleteStudent();
		
	}//main

}//class
