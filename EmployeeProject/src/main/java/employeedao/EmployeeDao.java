package employeedao;
import employeedto.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class EmployeeDao { 
		public int set_EmployeeDetails(EmployeeDto emp) {
			int result=0;
		 	try {
		 		String url="jdbc:mysql://localhost:3306/Demo";
			 	String userName="root";
			 	String password="radha";
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection(url,userName,password);	
		     	PreparedStatement pst = con.prepareStatement("INSERT INTO Employee(emp_name,doj,basic_salary) VALUES(?,?,?)");
		     	pst.setString(1,emp.getName());
		     	pst.setString(2,emp.getDate());
		     	pst.setDouble(3,emp.getSalary());
		     	result=pst.executeUpdate();
		     	con.close();
		 	}
		 	catch(Exception ie) {
		 		ie.printStackTrace();
		 	}
		 	return result;
		}
		public int get_empid(String emp_name)
		{
	        int emp_id=0;
			try {
		 		String url="jdbc:mysql://localhost:3306/Demo";
			 	String userName="root";
			 	String password="radha";
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection(url,userName,password);	
			    PreparedStatement pst = con.prepareStatement("Select emp_id from employee where emp_name=?");
			    pst.setString(1,emp_name);
			    ResultSet rst = pst.executeQuery();
			    if(rst.next()) {
			    	 emp_id=rst.getInt("emp_id");
			    	 return emp_id;
			    }
			    con.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
			return emp_id;
		

	}
		public void get_salary(int empid) 
		{
			EmployeeDto dto = new EmployeeDto();
			try {
		 		String url="jdbc:mysql://localhost:3306/Demo";
			 	String userName="root";
			 	String password="radha";
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection(url,userName,password);	
			    PreparedStatement pst = con.prepareStatement("Select emp_id from employee where emp_name=?");
			    pst.setInt(1,empid);
			    ResultSet rst = pst.executeQuery();
			    while(rst.next()) {
			    	dto.setName(rst.getString("emp_id"));
			    	dto.setDate(rst.getString("date"));
			    	dto.setSalary(rst.getDouble("basic_salary"));
			    }
			    con.close();
			}
			catch(Exception ie) {
				ie.printStackTrace();
			}
	}
}