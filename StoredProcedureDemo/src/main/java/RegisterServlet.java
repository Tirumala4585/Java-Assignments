

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("uname");
		String password=request.getParameter("pname");
		String fullName=request.getParameter("full_name");
		String email=request.getParameter("email");
		response.setContentType("Text/HTML");
		PrintWriter out=response.getWriter();
		out.println(userName+"</br>");
		out.println(password+"</br>");
		out.println(fullName+"</br>");
		out.println(email+"</br>");
		try {
			String url="jdbc:mysql://localhost:3306/user";
			String username="root";
			String pass_word="radha";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url,username,pass_word);
	    CallableStatement cst = con.prepareCall("{call get_details(?,?,?,?)}");
	    cst.setString(1, userName);
	    cst.setString(2,password);
	    cst.setString(3,fullName);
	    cst.setString(4,email);
	    int rowAffected =  cst.executeUpdate();
	    if(rowAffected>0) {
	    	out.print("Successfully registered");
	    }
	    else {
	    	out.print("Not Registered");
	    }	
		}
		catch(Exception ie) {
			ie.getMessage();
		}
	}

}
