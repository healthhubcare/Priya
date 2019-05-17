package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bef_Model.AddBef_Model;
import DAO.AddBef_DAO;

/**
 * Servlet implementation class AddBef_Ser
 */
@WebServlet("/AddBef_Ser")
public class AddBef_Ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBef_Ser() {
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
		String bef_id=request.getParameter("bef_Id");
		String bef_name=request.getParameter("bef_Name");
		String bef_acctype=request.getParameter("acc_type");
		String bef_accNo=request.getParameter("bef_AccNo");
		String con_accNo=request.getParameter("Con_AccNo");
		String mmid=request.getParameter("mmid");
		String ifsc=request.getParameter("ifsc");
		String amount_lim=request.getParameter("set_limit");
	    AddBef_DAO d=new AddBef_DAO();
	    AddBef_Model m=new AddBef_Model(bef_id,bef_name,bef_acctype,bef_accNo,con_accNo,mmid,ifsc,amount_lim); 
	    int result=d.insert(m);
	    request.setAttribute("id",bef_id);
	    request.setAttribute("name",bef_name );
	    request.setAttribute("atype",bef_acctype);
	    request.setAttribute("mmid", mmid);
	    request.setAttribute("ifsc", ifsc);
	    request.setAttribute("limit", amount_lim);
	    request.getRequestDispatcher("Bene_List.jsp").forward(request, response);
	    
	    
	    
	}

}
