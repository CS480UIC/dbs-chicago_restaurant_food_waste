package food_waste.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food_waste.dao.FoodWasteDao;
import food_waste.domain.FoodWaste;


/**
 * Servlet implementation class UserServlet
 */

public class FoodWasteServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodWasteServletRead() {
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
		FoodWaste entity1 = null;
		FoodWasteDao foodWasteDao = new FoodWasteDao();
		
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
					System.out.println(entity1);
					request.setAttribute("food_waste", entity1);
					request.getRequestDispatcher("/jsps/food_waste/food_waste_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "FoodWaste not found");
			request.getRequestDispatcher("/jsps/food_waste/food_waste_read_output.jsp").forward(request, response);
		}
	}
}



