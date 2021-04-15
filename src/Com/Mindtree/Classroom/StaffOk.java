package Com.Mindtree.Classroom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Mindtree.DOA.StaffDetailsImplementation;

/**
 * Servlet implementation class StaffOk
 */
@WebServlet("/StaffOk")
public class StaffOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StaffDetailsImplementation sdi=new StaffDetailsImplementation();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String StaffName=req.getParameter("staffName");
		String password=req.getParameter("staffPassword");
		 boolean res1 = sdi.staffCheck(StaffName,password);
		 if(res1==true)
			{
				   RequestDispatcher requestDispatcher = req.getRequestDispatcher("ClassRoom.html");  
			        requestDispatcher.forward(req, res);
			}
			else
			{
				 RequestDispatcher requestDispatcher = req.getRequestDispatcher("StaffLogin.jsp");
				   
			        requestDispatcher.forward(req, res);
			}
//		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("ClassRoom.html");
//		 
//	        requestDispatcher.forward(req, res);
	        pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ClassRoom.html");		 
	        requestDispatcher.forward(request, response);
	 
	}

}
