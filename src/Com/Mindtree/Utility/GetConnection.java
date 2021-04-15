package Com.Mindtree.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Com.Mindtree.Model.Student;

public class GetConnection {
 public static Connection getConnection()
 {
	 Connection con = null;
	
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 //Driver driver=new com.mysql.cj.jdbc.Driver();
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualclassroom1","root","Kiccha@123");
		// st=con.createStatement();
	 }catch(ClassNotFoundException e) {
		 System.out.println("Class not found bro");
	 }
	 catch(SQLException e)
	 {
		 System.out.println("SQL exception");
	 }
	return con;
 }

}
