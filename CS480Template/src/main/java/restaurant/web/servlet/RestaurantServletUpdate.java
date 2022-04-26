package restaurant.web.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurant.dao.RestaurantDao;
import restaurant.domain.Restaurant;

/**
 * Servlet implementation class UserServlet
 */

public class RestaurantServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RestaurantServletUpdate() {
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
		RestaurantDao entity1dao = new RestaurantDao();
		Restaurant entity1 = null;

		if(method.equals("search"))
		{
			try {
				entity1 = entity1dao.findByID(Integer.parseInt(request.getParameter("restaurant_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(entity1.getRestaurant_id()!=null){
				request.setAttribute("restaurant", entity1);
				request.getRequestDispatcher("/jsps/restaurant/restaurant_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "restaurant not found");
				request.getRequestDispatcher("/jsps/restaurant/restaurant_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Restaurant form = new Restaurant();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setName((info.get(2)));
			form.setAddress(info.get(3));
			form.setPhone_number(info.get(4));
			form.setFounded_date(Date.valueOf(info.get(5)));
			form.setRestaurant_id(Integer.parseInt(request.getParameter("restaurant_id")));

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "restaurant Updated");
			request.getRequestDispatcher("/jsps/restaurant/restaurant_read_output.jsp").forward(request, response);
		}
	}
}



