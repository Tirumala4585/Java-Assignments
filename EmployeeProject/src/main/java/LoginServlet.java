

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import employeedto.*;
import employeedao.*;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDao dao = new EmployeeDao();
		dao.get_salary(id);
		EmployeeDto dto = new EmployeeDto();
		String name=dto.getName();
		double salary=dto.getSalary();
		double HRA = (20*salary)/100;
		double DA =(20/salary)/100;
		double GS=salary+HRA+DA;
		double PF=(20*salary)/100;
		double NS=GS-PF;
		PrintWriter out = response.getWriter();
		out.print(name);
		out.print(salary);
		out.print(salary);
		out.print(HRA);
		out.print(DA);
		out.print(GS);
		out.print(PF);
		out.print(NS);
			
		}

}
		