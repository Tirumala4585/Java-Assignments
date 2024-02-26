package com.tmf.bankdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tmf.bankdto.BankDTO;

public class BankDAO {
    
	public Boolean setAccountDetails(BankDTO dto) {
		String url="jdbc:mysql://localhost:3306/bank";
		String userName="root";
		String password="root";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,password);
		PreparedStatement pst = con.prepareStatement("INSERT INTO bank_info(account_id,user_name,account_no,bank_name,isfc_code,account_type,current_balance)"+ "VALUES('"+dto.getAccountId()+"','"+dto.getUserName()+"','"+dto.getAccountNo()+"','"+dto.getBankName()+"','"+dto.getIsfcCode()+"','"+dto.getAccountType()+"','"+dto.getCurrentBalance()+"')");
	    int result=pst.executeUpdate();
	    return result>0;
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
		return false;
	}
}
