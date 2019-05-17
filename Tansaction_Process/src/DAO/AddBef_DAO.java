package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Bef_Model.AddBef_Model;
import oracle.jdbc.driver.OracleDriver;

public class AddBef_DAO 
{
     public int insert(AddBef_Model b)
     {
    	    String bef_id=b.getBef_id();
    		String bef_name=b.getBef_name();
    		String bef_acctype=b.getBef_acctype();
    		String bef_accNo=b.getCon_accNo();
    		String con_accNo=b.getCon_accNo();
    		String mmid=b.getMmid();
    		String ifsc=b.getIfsc();
    		String amount_lim=b.getAmount_lim();
    		String sql="insert into PRIYA1996.Beneficiary values(?,?,?,?,?,?,?,?)";
    		int result=0;
    		try
    		{
    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
    	    PreparedStatement pre=con.prepareStatement(sql);
    	    pre.setString(1, bef_id);
    	    pre.setString(2, bef_name);
    	    pre.setString(3, bef_acctype);
    	    pre.setString(4, bef_accNo);
    	    pre.setString(5, con_accNo);
    	    pre.setString(6, mmid);
    	    pre.setString(7, ifsc);
    	    pre.setString(8, amount_lim);
    	    result=pre.executeUpdate();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		
    	 return result; 
     }
}
