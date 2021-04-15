package Com.Mindtree.Classroom;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Mindtree.DOA.StaffDetailsImplementation;
import Com.Mindtree.Model.Staff;
import Com.Mindtree.Model.Student;

/**
 * Servlet implementation class ViewStaff
 */
@WebServlet("/ViewStaff")
public class ViewStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StaffDetailsImplementation sdi=new StaffDetailsImplementation();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStaff() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ResultSet rs=sdi.showStaff();
		Staff st=null;
		Staff[] staff=new Staff[15];
		try {
			int i=0;
			while(rs.next())
			{
			 st=new Staff(rs.getString("staffName"),rs.getShort("staffAge"),rs.getString("staffAddress"),
						rs.getString("staffCity"),rs.getShort("staffPinCode"),rs.getString("staffCountry"),rs.getString("staffEmail"),
						rs.getString("staffUserName"),rs.getString("staffPass"));
			 staff[i++]=st;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("result",staff);
		
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewStaff.jsp");  
	        requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
