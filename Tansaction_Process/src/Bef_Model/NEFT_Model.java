package Bef_Model;

public class NEFT_Model 
{
	String source_acc;
	String bef_id;
	String ifsc;
	String bef_AccNo;
	String bef_name;
	String trans_am;
	String remark;
	String trans_ID;
	
	
	


	public NEFT_Model() {
		
	}



	public NEFT_Model(String source_acc, String bef_id, String ifsc, String bef_AccNo, String bef_name, String trans_am,
			String remark,String trans_ID) {
		super();
		this.source_acc = source_acc;
		this.bef_id = bef_id;
		this.ifsc = ifsc;
		this.bef_AccNo = bef_AccNo;
		this.bef_name = bef_name;
		this.trans_am = trans_am;
		this.remark = remark;
		this.trans_ID = trans_ID;
	}



	public String getSource_acc() {
		return source_acc;
	}



	public void setSource_acc(String source_acc) {
		this.source_acc = source_acc;
	}



	public String getBef_id() {
		return bef_id;
	}



	public void setBef_id(String bef_id) {
		this.bef_id = bef_id;
	}



	public String getIfsc() {
		return ifsc;
	}



	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}



	public String getBef_AccNo() {
		return bef_AccNo;
	}



	public void setBef_AccNo(String bef_AccNo) {
		this.bef_AccNo = bef_AccNo;
	}



	public String getBef_name() {
		return bef_name;
	}



	public void setBef_name(String bef_name) {
		this.bef_name = bef_name;
	}



	public String getTrans_am() {
		return trans_am;
	}



	public void setTrans_am(String trans_am) {
		this.trans_am = trans_am;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTrans_ID() {
		return trans_ID;
	}



	public void setTrans_ID(String trans_ID) {
		this.trans_ID = trans_ID;
	}

	
}
