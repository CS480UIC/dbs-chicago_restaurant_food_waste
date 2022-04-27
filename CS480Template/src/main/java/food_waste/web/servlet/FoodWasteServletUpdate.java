package food_waste.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food_waste.dao.FoodWasteDao;
import food_waste.domain.FoodWaste;

/**
 * Servlet implementation class UserServlet
 */

public class FoodWasteServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FoodWasteServletUpdate() {
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
		FoodWasteDao foodWasteDao = new FoodWasteDao();
		FoodWaste entity1 = null;

		if(method.equals("search"))
		{
			try {
				entity1 = foodWasteDao.findByID(Integer.parseInt(request.getParameter("food_waste_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(entity1.getFood_waste_id()!=null){
				request.setAttribute("food_waste", entity1);
				request.getRequestDispatcher("/jsps/food_waste/food_waste_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "FoodWaste not found");
				request.getRequestDispatcher("/jsps/food_waste/food_waste_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			FoodWaste form = new FoodWaste();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setRestaurant_id(Integer.parseInt(info.get(2)));
			form.setAvg_daily_waste(Float.parseFloat(info.get(3)));
			form.setFood_waste_id(Integer.parseInt(request.getParameter("food_waste_id")));

			try {
				foodWasteDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "FoodWaste Updated");
			request.getRequestDispatcher("/jsps/food_waste/food_waste_read_output.jsp").forward(request, response);
		}
	}
}



