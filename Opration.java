package application;

import java.sql.*;

public class Opration {
	JdbcConnection Db = new JdbcConnection();
	Connection con;
	public void read() {
		try {
		con = Db.connectDb();
	    Statement stmt = con.createStatement();
	    String quary="select * from s1";
	    ResultSet s= stmt.executeQuery(quary);
	    System.out.println("ID    "+"NAME    "+"CITY");
	    while(s.next())
	    {
	    	System.out.print(s.getInt(1));
	    	System.out.print("    "+s.getString(2));
	    	System.out.println("    "+s.getString(3));
	    	
	    }
		con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}
	
	
	
	public void add(String n, String c) {
		
		try {
			con=Db.connectDb();
			String q= "insert into s1(tname,city) values (?,?)";
			PreparedStatement pstmt =con.prepareStatement(q);
			
			pstmt.setString(1, n);
			pstmt.setString(2, c);
			pstmt.execute();
		System.out.println("inserted successfully");
		con.close();
		} catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}



	public void nameUpdate(int d, String n) {
		try {
			con=Db.connectDb();
			String q= "update s1 set tname = ? where id =?";
			PreparedStatement pstmt =con.prepareStatement(q);
			
			pstmt.setString(1, n);
			pstmt.setInt(2, d);
			pstmt.execute();
		System.out.println("update successfully");
		con.close();
		} catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}



	public void nameName(int d, String n) {
		try {
			con=Db.connectDb();
			String q= "update s1 set city = ? where id =?";
			PreparedStatement pstmt =con.prepareStatement(q);
			
			pstmt.setString(1, n);
			pstmt.setInt(2, d);
			pstmt.execute();
		con.close();
		} catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}



	public void delete(String dd) {
		try {
			con=Db.connectDb();
			String q= "delete from s1 where tname = ?";
			PreparedStatement pstmt =con.prepareStatement(q);
			
			pstmt.setString(1, dd);
		
			pstmt.execute();
		con.close();
		} catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

		
	}


