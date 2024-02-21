

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("uname");
		String password=request.getParameter("pname");
		PrintWriter out = response.getWriter();
		//Database Connectivity
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_details","root","radha");
		    Statement stmt = con.createStatement();
		    ResultSet  rst = stmt.executeQuery("Select user_name,password from user_info where user_name='"+name+"' and password='"+password+"'");
		    if(rst.next())
		    {
                  response.sendRedirect("http://localhost:8083/Assignment1/SuccessfullServlet");
		    }
		    else
		    {
		    	 out.print("<h1>Login Details are failed</h1>");
		    	 RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
		    	 rd.include(request, response);
		    }
		}
		 catch(Exception ie)
		{
			 System.out.println(ie);
		   
		}
		finally 
		{
			try {
				if(con!=null) {
				  con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

	