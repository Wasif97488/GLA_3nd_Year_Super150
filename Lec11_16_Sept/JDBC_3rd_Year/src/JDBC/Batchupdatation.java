package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batchupdatation {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		 String username="root";
		 String password="root";
		 Connection con= DriverManager.getConnection(url,username,password);
		   Statement st=con.createStatement();
		   
		   String insert = "insert into student values(111,'Manish','Hathras')";
		   String insert1 = "insert into student values(112,'Manisha','mathura')";
		   String update = "update student set rollNo = 113 where name='wasif'";
		   String delete = "delete from student where rollNo=104";
//		   st.executeUpdate(insert);
//		   st.executeUpdate(insert1);
//		   st.executeUpdate(update);
//		   st.executeUpdate(delete);
		   
		   st.addBatch(insert);
		   st.addBatch(insert1);
		   st.addBatch(update);
		   st.addBatch(delete);
		   
		   int[] a= st.executeBatch();
		   System.out.println(a.length);
		   st.close();
	}

}
