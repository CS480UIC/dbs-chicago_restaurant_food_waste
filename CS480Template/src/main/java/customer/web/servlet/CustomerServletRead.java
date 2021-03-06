package customer.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.dao.CustomerDao;
import customer.domain.Customer;


/**
 * Servlet implementation class UserServlet
 */

public class CustomerServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServletRead() {
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
		Customer entity1 = null;
		CustomerDao entity1Dao = new CustomerDao();
		
		try {
			entity1 = entity1Dao.findByID(Integer.parseInt(request.getParameter("customer_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getCustomer_id()!=null){
					System.out.println(entity1);
					request.setAttribute("entity1", entity1);
					request.getRequestDispatcher("/jsps/customer/customer_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Customer not found");
			request.getRequestDispatcher("/jsps/customer/customer_read_output.jsp").forward(request, response);
		}
	}
}



