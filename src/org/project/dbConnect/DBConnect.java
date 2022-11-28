package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//JDBC 연결 클래스 생성
public class DBConnect {

	//static method(정적 메소드) getConnection()
	//객체 생성없이 클래스를 통해 메서드를 직접 호출할 수 있다.
	public static Connection getConnetion() {
		
		//데이터베이스와 연결하는 객체
		Connection conn = null;
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/todo-list?useSSL=false";
		String user = "root"; // DB ID
		String password = "1234"; // DB Password
		
		
		try {
			// JDBC 드라이버 로딩
			Class.forName(driver);
			System.out.println("Driver Ok");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password); // DB 연결
			System.out.println("DB Connect Ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver No");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB Connect No");
		} 
		
		return conn;
		
	}
}
