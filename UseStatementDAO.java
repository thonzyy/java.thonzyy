package kr.co.sist.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DAO (Data Acces Object)
 * DBMS작업 중 쿼리문에 관한 업무를 정의하는 클래스
 * @author user
 *
 */
public class UseStatementDAO {
	public void createStudentTableIndex() throws SQLException {
		Connection con = null;
		Statement stmt=null;
		//1. 로딩하기
		//2. 커넥션얻기
		DBConnection dc = new DBConnection();
		try {
		con=dc.getConn();
		//3. 쿼리문 생성객체 얻기
		stmt=con.createStatement();
		//4. 쿼리문 수행결과 얻기
		String  createStudent =
		"create index ind_date_student on student(input_date )";
	
		/*boolean flag =*/stmt.execute(createStudent);
		System.out.println("인덱스 생성완료 되었다");
		} finally {
		//5. 연결 끊기
			dc.closeDB(null, stmt, con);
		}
	}
	public void createStudentTable() throws SQLException {
		Connection con = null;
		Statement stmt=null;
		//1. 로딩하기
		//2. 커넥션얻기
		DBConnection dc = new DBConnection();
		try {
		con=dc.getConn();
		//3. 쿼리문 생성객체 얻기
		stmt=con.createStatement();
		//4. 쿼리문 수행결과 얻기
		StringBuilder createStudent = new StringBuilder();
		createStudent
		.append("	create table student (                                  	")
		.append("	num number(5),	                                        ")
		.append("	name varchar2(30)not null,	                            ")
		.append("	age number(3) check (age between 20 and 39),	")
		.append("	email varchar2(50),	                                    ")
		.append("	input_date date,	                                        ")
		.append("	constraint pk_student primary key (num) 	        ")
		.append("	)	                                                            ");
		/*boolean flag =*/stmt.execute(createStudent.toString());
		System.out.println("테이블 생성완료 되었다");
		} finally {
		//5. 연결 끊기
			dc.closeDB(null, stmt, con);
		}
	}//createStudentTable
		public void insertStudent () {
			
		}
		
		public void insertStudent(StudentVO sVO)throws SQLException {
			Connection con = null;
			Statement stmt = null;
			DBConnection dc = new DBConnection();
			
			
			//1.로딩얻기
			try {
			//2. 커넥션얻기
				con=dc.getConn();
				stmt=con.createStatement();
			//3. 쿼리문 생성 객체 얻기
				StringBuilder insertStudent = new StringBuilder();
				insertStudent.
				append("insert into student(NUM, NAME, AGE, EMAIL, INPUT_DATE )")
				.append("values(").append(sVO.getNum()).append(", '")
				.append(sVO.getName()).append("', ").append(sVO.getAge())
				.append(", '").append(sVO.getEmail()).append("', sysdate)");
				
				int rowCnt=stmt.executeUpdate(insertStudent.toString());
				System.out.println(rowCnt+"추가 완료");
		
			
			//4. 수행 후 결과 얻기
			} finally {
				//5. 연결 끊기
				dc.closeDB(null, stmt, con);
			}
		}
		
		public int updateStudent(StudentVO sVO)throws SQLException {
			Connection con = null;
			Statement stmt = null;
			DBConnection dc = new DBConnection();
			int rowCnt = 0;
			
			//1.로딩얻기
			try {
			//2. 커넥션얻기
				con=dc.getConn();
				stmt=con.createStatement();
			//3. 쿼리문 생성 객체 얻기
				StringBuilder updateStudent = new StringBuilder();
				updateStudent.
				append("update STUDENT")
				.append(" set email ='").append(sVO.getEmail()).append("'")
				.append(" where NUM =").append(sVO.getNum());
				
				rowCnt=stmt.executeUpdate(updateStudent.toString());
				
			
			
			//4. 수행 후 결과 얻기
			} finally {
				//5. 연결 끊기
				dc.closeDB(null, stmt, con);
			}
			return rowCnt;
		}
		
		public void deleteStudent(StudentVO sVO)throws SQLException {
			Connection con = null;
			Statement stmt = null;
			DBConnection dc = new DBConnection();
			
			
			//1.로딩얻기
			try {
			//2. 커넥션얻기
				con=dc.getConn();
				stmt=con.createStatement();
			//3. 쿼리문 생성 객체 얻기
				StringBuilder deleteStudent = new StringBuilder();
				deleteStudent.
				append("delete from STUDENT")
				.append(" where NUM =").append(sVO.getNum());
				
				int rowCnt=stmt.executeUpdate(deleteStudent.toString());
				System.out.println(rowCnt+"delete 완료");
				
			
			//4. 수행 후 결과 얻기
			} finally {
				//5. 연결 끊기
				dc.closeDB(null, stmt, con);
			}
			
		}
		
//2번 학생의 이메일을 KANG@TEST.COM 에서 KANG1@DAUM.NET으로 변경
}//CLASS
