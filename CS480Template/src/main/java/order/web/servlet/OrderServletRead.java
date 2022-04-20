package order.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import order.dao.OrderDao;
import order.domain.Order;


/**
 * Servlet implementation class UserServlet
 */

public class OrderServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServletRead() {
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
		Order entity1 = null;
		OrderDao entity1Dao = new OrderDao();
		
		try {
			entity1 = entity1Dao.findByID(Integer.parseInt(request.getParameter("order_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getOrder_id()!=null){
					System.out.println(entity1.getOrder_id());
					request.setAttribute("entity1", entity1);
					request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Order not found");
			request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
		}
	}
}



