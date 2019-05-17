package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bef_Model.NEFT_Model;
import DAO.NEFT_DAO;

/**
 * Servlet implementation class NEFT_Ser
 */
@WebServlet("/NEFT_Ser")
public class NEFT_Ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NEFT_Ser() {
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
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String source_acc=request.getParameter("source_Acc");
		String bef_id=request.getParameter("bef_list");
		String ifsc=request.getParameter("ifsc");
		String bef_AccNo=request.getParameter("bef_AccNo");
		String bef_name=request.getParameter("bef_Name");
		String trans_am=request.getParameter("trans_amount");
		String remark=request.getParameter("Remark");
		Random r=new Random();
		int r1=r.nextInt();
		String trans_ID=Integer.toString(r1);
		NEFT_DAO n=new NEFT_DAO();
		NEFT_Model nm=new NEFT_Model(source_acc,bef_id,ifsc,bef_AccNo,bef_name,trans_am,remark,trans_ID);
		int result=n.insert(nm);
		if(result>0)
		{

	    	out.println("Amount Transfer Successfully");
	    	
		}
		
		
		
		
	}

}
