package Com.Mindtree.DOA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.Mindtree.Model.Student;
import Com.Mindtree.Utility.GetConnection;

public class StudentDetailsImplementation implements StudentDetailsOperations{

	@Override
	public String insertStudent(Student st) {
		// TODO Auto-generated method stub
		 Connection con=GetConnection.getConnection();
		//Connection con=null;
		PreparedStatement ps=null;
		
		 String query="insert into student(studentName,age,address,city,pinCode,country,email,userName,password) values(?,?,?,?,?,?,?,?,?)";
		 try {
			 ps=con.prepareStatement(query);
			ps.setString(1,st.getStudentName());
			ps.setShort(2,st.getAge());
			ps.setString(3,st.getAddress());
			ps.setString(4,st.getCity());
			ps.setShort(5,st.getPincode());
			ps.setString(6,st.getCountry());
			ps.setString(7,st.getStudentMail());	
			ps.setString(8,st.getStudentUserName());
			ps.setString(9,st.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Ok";
	}

	public boolean validate(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean studentCheck(String userName, String password) {
		
		// TODO Auto-generated method stub
		 Connection con=GetConnection.getConnection();
			//Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 boolean flag=false;
		 String query="select * from student where userName=? and password=?";
		 try {
			 ps=con.prepareStatement(query);
			ps.setString(1,userName);
			ps.setString(2,password);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// boolean flag=false;
		if(rs!=null)
		 {
			 flag=true;
		 }
		 else
		 {
			 flag=false;
		 }
		return flag;
	}

	@Override
	public ResultSet showStudent() {
		// TODO Auto-generated method stub
		 Connection con=GetConnection.getConnection();
		 ResultSet rs=null;
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 String query="select * from student";
		 try {
			rs=st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public String deleteStudent(String str) {
		// TODO Auto-generated method stub
		 Connection con=GetConnection.getConnection();
		 PreparedStatement ps=null;
			
		 String query="delete from student where userName=?";
		 try {
			 ps=con.prepareStatement(query);
			ps.setString(1,str);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Ok";
	}

}
