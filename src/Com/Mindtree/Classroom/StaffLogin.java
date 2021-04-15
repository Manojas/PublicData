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
import Com.Mindtree.DOA.StaffDetailsOperations;
import Com.Mindtree.Model.Staff;
import Com.Mindtree.Model.Student;

/**
 * Servlet implementation class StaffLogin
 */
@WebServlet("/StaffLogin")
public class StaffLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StaffDetailsImplementation sdi=new StaffDetailsImplementation();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffLogin() {
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
		String StudentName=req.getParameter("name");
		short age=(short)Integer.parseInt(req.getParameter("age"));
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		short pincode=(short)Integer.parseInt(req.getParameter("pincode"));
		String country=req.getParameter("country");
		String email=req.getParameter("email");
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
	
		Staff staff=new Staff(StudentName,age,address,city,pincode,country,email,user,pass);
		//student.toString();
		sdi.insertStaff(staff);
		
		//boolean result=sdi.validate(student);		
		//pw.println("Welcome "+user+" Your password is "+pass);
	
	    RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
		 
        requestDispatcher.forward(req, res);
        pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
//		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
//		 
//	        requestDispatcher.forward(request, response);
	 
	}

}
