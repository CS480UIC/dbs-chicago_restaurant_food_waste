package supplier.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import supplier.dao.SupplierDao;
import supplier.domain.Supplier;


/**
 * Servlet implementation class UserServlet
 */

public class SupplierServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierServletDelete() {
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
		SupplierDao supplierDao = new SupplierDao();
		Supplier entity1 = null;
		if(method.equals("search"))
		{
			try {
				entity1 = supplierDao.findByID(Integer.parseInt(request.getParameter("supplier_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(entity1.getSupplier_id()!=null){
						//System.out.println(menu);
						request.setAttribute("supplier", entity1);
						request.getRequestDispatcher("/jsps/supplier/supplier_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Supplier not found");
				request.getRequestDispatcher("/jsps/supplier/supplier_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				supplierDao.delete(Integer.parseInt(request.getParameter("supplier_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Supplier Deleted");
			request.getRequestDispatcher("/jsps/supplier/supplier_read_output.jsp").forward(request, response);
		}
	}
}



