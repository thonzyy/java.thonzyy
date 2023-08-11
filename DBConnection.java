package kr.co.sist.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB작업에 공통코드(Connection 얻기, 끊기)를 정의
 * 
 * @author user
 *
 */
public class DBConnection {
	public Connection getConn() throws SQLException {
		Connection con = null;
		// 1.드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end catch

		// 2. 커넥션얻기
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";

		con = DriverManager.getConnection(url, id, pass);

		return con;
	}

	public void closeDB(ResultSet rs, Statement stmt, Connection con) throws SQLException {
		if (rs != null) {
			rs.close();
		} // end if
		if (stmt != null) {
			stmt.close();
		} // end if
		if (con != null) {
			con.close();
		} // end if
	}// closeDB
}
