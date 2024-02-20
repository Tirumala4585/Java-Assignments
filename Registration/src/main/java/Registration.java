

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
		String username = request.getParameter("uname");
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String phno = request.getParameter("phno");
		String email = request.getParameter("email");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con=null;
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User_details","root","radha");
			PreparedStatement pst = con.prepareStatement("Insert into user_regis(user_name,first_name,last_name,user_phno,email) values(?,?,?,?,?)");
			pst.setString(1,username);
			pst.setString(2,firstname);
			pst.setString(3,lastname);
			pst.setString(4,phno);
			pst.setString(5,email);
           	result=pst.executeUpdate();
           	if(result==1) {
           		response.sendRedirect("http://localhost:8083/Registration/RegistrationSuccess.jsp");
           	}
           	else {
           		out.print("Not registered");
           	}	
           	}
		    catch(Exception ie) {
		    	out.print(ie);
		    }
		    finally {
		    	try {
		    		if(con!=null) {
					con.close();
		    		}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		doGet(request, response);
	}

}

