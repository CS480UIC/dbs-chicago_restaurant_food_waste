package dumpster.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dumpster.dao.DumpsterDao;
import dumpster.domain.Dumpster;


/**
 * Servlet implementation class UserServlet
 */

public class DumpsterServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DumpsterServletDelete() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		DumpsterDao dumpster1Dao = new DumpsterDao();
		Dumpster dumpster1 = null;
		if(method.equals("search"))
		{
			try {
				dumpster1 = dumpster1Dao.findByID(Integer.parseInt(request.getParameter("dumpster_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(dumpster1.getDumpster_id()!=null){
						System.out.println(dumpster1);
						request.setAttribute("dumpster", dumpster1);
						request.getRequestDispatcher("/jsps/dumpster/dumpster_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Order not found");
				request.getRequestDispatcher("/jsps/dumpster/dumpster_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				dumpster1Dao.delete(Integer.parseInt(request.getParameter("dumpster_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Dumpster Deleted");
			request.getRequestDispatcher("/jsps/dumpster/dumpster_read_output.jsp").forward(request, response);
		}
	}
}



