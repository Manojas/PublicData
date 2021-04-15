package Com.Mindtree.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.Mindtree.Model.Staff;
import Com.Mindtree.Utility.GetConnection;

public class StaffDetailsImplementation implements StaffDetailsOperations{

	@Override
	public String insertStaff(Staff st) {
		// TODO Auto-generated method stub
		Connection con=GetConnection.getConnection();
		//Connection con=null;
		PreparedStatement ps=null;
		
		 String query="insert into staff(staffName,staffAge,staffAddress,staffCity,staffPinCode,staffCountry,staffEmail,staffUserName,staffPass) values(?,?,?,?,?,?,?,?,?)";
		 try {
			 ps=con.prepareStatement(query);
			ps.setString(1,st.getStaffName());
			ps.setShort(2,st.getAge());
			ps.setString(3,st.getAddress());
			ps.setString(4,st.getCity());
			ps.setShort(5,st.getPincode());
			ps.setString(6,st.getCountry());
			ps.setString(7,st.getStaffMail());	
			ps.setString(8,st.getStaffName());
			ps.setString(9,st.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Added";
	}

	public boolean staffCheck(String staffName, String password) {
		// TODO Auto-generated method stub
		Connection con=GetConnection.getConnection();
		//Connection con=null;
	 PreparedStatement ps=null;
	 ResultSet rs=null;
	 boolean flag=true;
	 String query="select * from staff where staffUserName=? and staffPass=?";
	 try {
		 ps=con.prepareStatement(query);
		ps.setString(1,staffName);
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

	public ResultSet showStaff() {
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
		 String query="select * from staff";
		 try {
			rs=st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public String deleteStaff(String name) {
		// TODO Auto-generated method stub
		 Connection con=GetConnection.getConnection();
		 PreparedStatement ps=null;
			
		 String query="delete from staff where staffUserName=?";
		 try {
			 ps=con.prepareStatement(query);
			ps.setString(1,name);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Ok";
		
	}


	

}
