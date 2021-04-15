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

import Com.Mindtree.DOA.StudentDetailsImplementation;
import Com.Mindtree.Model.Student;

/**
 * Servlet implementation class ViewStudent
 */
@WebServlet("/ViewStudent")
public class ViewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
      StudentDetailsImplementation sdi=new StudentDetailsImplementation(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ResultSet rs=sdi.showStudent();
		Student st=null;
		Student[] student=new Student[15];
		try {
			int i=0;
			while(rs.next())
			{
			 st=new Student(rs.getString("studentName"),rs.getShort("age"),rs.getString("address"),
						rs.getString("city"),rs.getShort("pinCode"),rs.getString("email"),rs.getString("email"),
						rs.getString("userName"),rs.getString("password"));
			 student[i++]=st;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("result",student);
		
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewStudent.jsp");  
	        requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ResultSet rs=sdi.showStudent();
	}

}
