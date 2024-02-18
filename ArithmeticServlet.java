

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ArithmeticServlet
 */
public class ArithmeticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArithmeticServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
		double num1 = Double.parseDouble(request.getParameter("n1"));
		double num2 = Double.parseDouble(request.getParameter("n2"));	
		String operator=request.getParameter("oper");
		int rst=0;
		switch(operator) {
		  case"+":
			  rst=(int)(num1+num2);
			  out.print(rst);
		      break;
		  case"-":
			  rst=(int)(num1-num2);
			  out.print(rst);
		      break;
		  case"*":
			  rst=(int)(num1*num2);
			  out.print(rst);
		      break;
		  case"/": 
			  rst=(int)(num1/num2);
			  out.print(rst);
		      break; 
		  case"%":
			  rst=(int)(num1%num2);
			  out.print(rst);
			  break;
		 default:
		   out.print("Please enter valid operator");
		
		}
		request.setAttribute("result",rst);
		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);
		}
		catch(ArithmeticException ie) {
			out.print("Secon number can not be a zero");
		}
		catch(NumberFormatException ie) {
			out.print("Please enter numbers");
		}
		catch(Exception ie) {
			out.print(ie);
		}
		doGet(request,response);
	}
		
	}
