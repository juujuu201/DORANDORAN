package doran.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getCon() throws SQLException{
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@10.96.123.224:1521:xe";
		    String user = "doran";
		    String pass = "1234";
		    
		    conn = DriverManager.getConnection(url, user, pass);
		    return conn;
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
