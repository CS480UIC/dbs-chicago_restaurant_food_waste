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

public class DumpsterServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DumpsterServletRead() {
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
		Dumpster entity1 = null;
		DumpsterDao entity1Dao = new DumpsterDao();
		
		try {
			entity1 = entity1Dao.findByID(Integer.parseInt(request.getParameter("dumpster_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getDumpster_id()!=null){
					System.out.println(entity1.getDumpster_id());
					request.setAttribute("dumpster", entity1);
					request.getRequestDispatcher("/jsps/dumpster/dumpster_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Dumpster not found");
			request.getRequestDispatcher("/jsps/dumpster/dumpster_read_output.jsp").forward(request, response);
		}
	}
}



