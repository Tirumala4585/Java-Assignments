

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tmf.bankdao.BankDAO;
import com.tmf.bankdto.BankDTO;

/**
 * Servlet implementation class AddAccount
 */
public class AddAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAccount() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("user_name");
		String accountNo=request.getParameter("account_type");
		String isfcCode=request.getParameter("isfc_code");
		String bankName=request.getParameter("bank_name");
		String accountType=request.getParameter("account_type");
		double currBal=Double.parseDouble(request.getParameter("starting_bal"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		BankDAO dao = new BankDAO();
		BankDTO dto = new BankDTO();
		dto.setUserName(userName);
		dto.setAccountNo(accountNo);
	    dto.setBankName(bankName);
	    dto.setIsfcCode(isfcCode);
	    dto.setAccountType(accountType);
	    dto.setCurrentBalance(currBal);
	    if(dao.setAccountDetails(dto)) {
		     out.print("Account details are Added");
	    }
	    else
	    {
	    	out.print("Your Accoutn details are not Added");
	    }
		
	}

}
