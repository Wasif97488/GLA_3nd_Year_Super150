package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCProgram {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//load and register the driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 //establish connection bt java and db
		 String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		 String username="root";
		 String password="root";
	  Connection con= DriverManager.getConnection(url,username,password);
	   Statement st=   con.createStatement();
//	 int n=  st.executeUpdate("create database JDBC_3rd_Year");
//	 System.out.println(n);
	   
	  int n1=st.executeUpdate("create table student(rollno int,name varchar(20),city varchar(20))");
	   System.out.println(n1);
	   
	   con.close();
	}

}
