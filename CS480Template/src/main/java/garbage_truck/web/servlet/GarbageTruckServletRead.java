package garbage_truck.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import garbage_truck.dao.GarbageTruckDao;
import garbage_truck.domain.GarbageTruck;


/**
 * Servlet implementation class UserServlet
 */

public class GarbageTruckServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GarbageTruckServletRead() {
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
		GarbageTruck entity1 = null;
		GarbageTruckDao entity1Dao = new GarbageTruckDao();
		
		try {
			entity1 = entity1Dao.findByID(Integer.parseInt(request.getParameter("truck_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getTruck_id()!=null){
					System.out.println(entity1.getTruck_id());
					request.setAttribute("garbage_truck", entity1);
					request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Order not found");
			request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_read_output.jsp").forward(request, response);
		}
	}
}



