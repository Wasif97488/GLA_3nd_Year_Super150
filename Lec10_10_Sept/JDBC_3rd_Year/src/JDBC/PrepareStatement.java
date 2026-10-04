package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		 String username="root";
		 String password="root";
		 Connection con= DriverManager.getConnection(url,username,password);
		 PreparedStatement ps=   con.prepareStatement("insert into student values(?,?,?)");
		 
		 ps.setInt(1, 204);
		 ps.setString(2, "dhhd");
		 ps.setString(3, "Delhi");
		 ps.addBatch();
		 
		 ps.setInt(1, 205);
		 ps.setString(2, "poo");
		 ps.setString(3, "Ballabgarh");
		 ps.addBatch();
		 
		 
		 
		 ps.executeBatch();
		 
		 ps.close();
		 
	}

}
