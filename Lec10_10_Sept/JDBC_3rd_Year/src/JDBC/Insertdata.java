package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertdata {  
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		 String username="root";
		 String password="root";
		 Connection con= DriverManager.getConnection(url,username,password);
		   Statement st=con.createStatement();
//		   String query="insert into student values(103,'ROhit','Lucknow')";
//		   st.executeUpdate(query);
		   
//		   String updateQuery="update student set rollNo=105 where name='ROhit'";
//		   st.executeUpdate(updateQuery);
		   
//		   String deleteQuery= "delete from student where name='ROhit'";
//		   st.executeUpdate(deleteQuery);
		   
		   Scanner sc = new Scanner(System.in);
//		  int rollNo= sc.nextInt();
//		  String name = sc.next();
//		  String city = sc.next();
//		  
//		  //  insert into student values(104,'Coder','Pune')
//		   String query1="insert into student values("+rollNo+",'"+name+"','"+city+"')";
//		   st.executeUpdate(query1);
		   
//		   int rollNo= sc.nextInt();
//		 String name = sc.next();
		 //  update student set name='harshit' where rollNo=102
//		 String query2 = "update student set name='"+name+"' where rollNo="+rollNo;
//		   st.executeUpdate(query2);
		   
		   String query = "select * from student";
		  ResultSet rs = st.executeQuery(query);
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));

		  }
		   
		   st.close();
	}
	

}
