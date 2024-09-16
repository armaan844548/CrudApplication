package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	Connection con;
	public Connection connectDb() {
	try {
		String url = "jdbc:mysql://localhost:3306/armaan";
		String user="root";
		String password= "@Naresh@";
		 con = DriverManager.getConnection(url,user,password);
	    System.out.println("connected");
	}catch (Exception e) {
		e.printStackTrace();
	}
return con;
	}
}
