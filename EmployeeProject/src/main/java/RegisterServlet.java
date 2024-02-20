

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import employeedao.EmployeeDao;
import employeedto.EmployeeDto;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("ename");
		String date=request.getParameter("doj");
		double salary = Double.parseDouble(request.getParameter("basicsal"));
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		EmployeeDto dto = new EmployeeDto(name,date,salary);
		EmployeeDao dao= new EmployeeDao();
		int result = dao.set_EmployeeDetails(dto);
		if(result!=0)
		{
			int emp_id=dao.get_empid(name);
			request.setAttribute("empid",emp_id);
			RequestDispatcher rd = request.getRequestDispatcher("RegisterSuccess.jsp");
			rd.forward(request,response);
		}
		else {
			out.print("Please Register Again");
			RequestDispatcher rd = request.getRequestDispatcher("/RegisterServlet.jsp");
			rd.include(request,response);
		}
		doGet(request, response);
	}

}
