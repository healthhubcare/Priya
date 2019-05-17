package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Bef_Model.AddBef_Model;
import Bef_Model.NEFT_Model;

public class NEFT_DAO 
{
	 public int insert(NEFT_Model b)
     {
		    String source_acc=b.getSource_acc();
			String bef_id=b.getBef_id();
			String ifsc=b.getIfsc();
			String bef_AccNo=b.getBef_AccNo();
			String bef_name=b.getBef_name();
			String trans_am=b.getTrans_am();
			String remark=b.getRemark();
			String trans_ID=b.getTrans_ID();
		    int result=0;
		    String sql="insert into PRIYA1996.NEFT values(?,?,?,?,?,?,?)";
    	
    		try
    		{
    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
    	    PreparedStatement pre=con.prepareStatement(sql);
    	    pre.setString(1, source_acc);
    	    pre.setString(2, bef_id);
    	    pre.setString(3, ifsc);
    	    pre.setString(4, bef_AccNo);
    	    pre.setString(5, bef_name);
    	    pre.setString(6, trans_am);
    	    pre.setString(7, remark);
    	    pre.setString(8, trans_ID);
    	    result=pre.executeUpdate();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
		 return result;
     }
}
