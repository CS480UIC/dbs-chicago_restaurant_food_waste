package restaurant.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurant.dao.RestaurantDao;
import restaurant.domain.Restaurant;


/**
 * Servlet implementation class UserServlet
 */

public class RestaurantServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantServletRead() {
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
		Restaurant entity1 = null;
		RestaurantDao entity1Dao = new RestaurantDao();
		
		try {
			entity1 = entity1Dao.findByID(Integer.parseInt(request.getParameter("restaurant_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getRestaurant_id()!=null){
					System.out.println(entity1);
					request.setAttribute("restaurant", entity1);
					request.getRequestDispatcher("/jsps/restaurant/restaurant_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "restaurant not found");
			request.getRequestDispatcher("/jsps/restaurant/restaurant_read_output.jsp").forward(request, response);
		}
	}
}



