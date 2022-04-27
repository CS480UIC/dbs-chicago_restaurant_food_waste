package garbage_truck.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import garbage_truck.dao.GarbageTruckDao;
import garbage_truck.domain.GarbageTruck;

/**
 * Servlet implementation class UserServlet
 */

public class GarbageTruckServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GarbageTruckServletUpdate() {
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
		GarbageTruckDao entity1dao = new GarbageTruckDao();
		GarbageTruck entity1 = null;

		if(method.equals("search"))
		{
			try {
				entity1 = entity1dao.findByID(Integer.parseInt(request.getParameter("truck_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(entity1.getTruck_id()!=null){
				request.setAttribute("garbage_truck", entity1);
				request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Order not found");
				request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			GarbageTruck form = new GarbageTruck();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setRestaurant_id(Integer.parseInt(info.get(2)));
			form.setTruck_capacity(Integer.parseInt(info.get(3)));
			form.setTruck_id(Integer.parseInt(request.getParameter("truck_id")));

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Order Updated");
			request.getRequestDispatcher("/jsps/garbage_truck/garbage_truck_read_output.jsp").forward(request, response);
		}
	}
}



