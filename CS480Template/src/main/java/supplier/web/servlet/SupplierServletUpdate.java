package supplier.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import supplier.dao.SupplierDao;
import supplier.domain.Supplier;

/**
 * Servlet implementation class UserServlet
 */

public class SupplierServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SupplierServletUpdate() {
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
				request.setAttribute("supplier", entity1);
				request.getRequestDispatcher("/jsps/supplier/supplier_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Supplier not found");
				request.getRequestDispatcher("/jsps/supplier/supplier_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Supplier form = new Supplier();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setRestaurant_id(Integer.parseInt(info.get(2)));
			form.setAddress(info.get(3));
			form.setPhone_number(info.get(4));
			form.setSupplier_id(Integer.parseInt(request.getParameter("supplier_id")));

			try {
				supplierDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Supplier Updated");
			request.getRequestDispatcher("/jsps/supplier/supplier_read_output.jsp").forward(request, response);
		}
	}
}



