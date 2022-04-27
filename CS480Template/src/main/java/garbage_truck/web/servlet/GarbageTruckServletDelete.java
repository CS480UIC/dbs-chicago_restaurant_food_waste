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

public class GarbageTruckServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GarbageTruckServletDelete() {
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
		GarbageTruckDao entity1Dao = new GarbageTruckDao();
		GarbageTruck entity1 = null;
		if(method.equals("search"))
		{
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
						System.out.println(entity1);
						request.setAttribute("garbage_truck", entity1);
						request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Garbage Truck not found");
				request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				entity1Dao.delete(Integer.parseInt(request.getParameter("truck_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Garbage Truck Deleted");
			request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_read_output.jsp").forward(request, response);
		}
	}
}



