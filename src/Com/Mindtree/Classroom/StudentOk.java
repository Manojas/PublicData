package Com.Mindtree.Classroom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Mindtree.DOA.StudentDetailsImplementation;

/**
 * Servlet implementation class StudentOk
 */
@WebServlet("/StudentOk")
public class StudentOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StudentDetailsImplementation sdi=new StudentDetailsImplementation();
        boolean res1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 boolean res1;
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String userName=req.getParameter("StudentName");
		String password=req.getParameter("StudentPassword");
		 res1=sdi.studentCheck(userName,password);
		 if(res1==true)
			{
				   RequestDispatcher requestDispatcher = req.getRequestDispatcher("ClassRoom.html");  
			        requestDispatcher.forward(req, res);
			}
			else
			{
				 RequestDispatcher requestDispatcher = req.getRequestDispatcher("StudentLogin.jsp");
				   
			        requestDispatcher.forward(req, res);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if(res1==true)
		{
			   RequestDispatcher requestDispatcher = request.getRequestDispatcher("ClassRoom.html");  
		        requestDispatcher.forward(request, response);
		}
		else
		{
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentLogin.jsp");
			   
		        requestDispatcher.forward(request, response);
		}
	}

}
