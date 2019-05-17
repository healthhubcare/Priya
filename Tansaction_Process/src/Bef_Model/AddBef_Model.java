package Bef_Model;

public class AddBef_Model 
{
	String bef_id;
	String bef_name;
	String bef_acctype;
	String bef_accNo;
	String con_accNo;
	String mmid;
	String ifsc;
	String amount_lim;
	
	
	public AddBef_Model() 
	{
		
	}


	public AddBef_Model(String bef_id, String bef_name, String bef_acctype, String bef_accNo, String con_accNo,
			String mmid, String ifsc, String amount_lim) {
		super();
		this.bef_id = bef_id;
		this.bef_name = bef_name;
		this.bef_acctype = bef_acctype;
		this.bef_accNo = bef_accNo;
		this.con_accNo = con_accNo;
		this.mmid = mmid;
		this.ifsc = ifsc;
		this.amount_lim = amount_lim;
	}
	
	
	public String getBef_id() {
		return bef_id;
	}
	public void setBef_id(String bef_id) {
		this.bef_id = bef_id;
	}
	public String getBef_name() {
		return bef_name;
	}
	public void setBef_name(String bef_name) {
		this.bef_name = bef_name;
	}
	public String getBef_acctype() {
		return bef_acctype;
	}
	public void setBef_acctype(String bef_acctype) {
		this.bef_acctype = bef_acctype;
	}
	public String getBef_accNo() {
		return bef_accNo;
	}
	public void setBef_accNo(String bef_accNo) {
		this.bef_accNo = bef_accNo;
	}
	public String getCon_accNo() {
		return con_accNo;
	}
	public void setCon_accNo(String con_accNo) {
		this.con_accNo = con_accNo;
	}
	public String getMmid() {
		return mmid;
	}
	public void setMmid(String mmid) {
		this.mmid = mmid;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAmount_lim() {
		return amount_lim;
	}
	public void setAmount_lim(String amount_lim) {
		this.amount_lim = amount_lim;
	}
	
	
}
