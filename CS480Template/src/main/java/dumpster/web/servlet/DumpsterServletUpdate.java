package dumpster.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dumpster.dao.DumpsterDao;
import dumpster.domain.Dumpster;

/**
 * Servlet implementation class UserServlet
 */

public class DumpsterServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DumpsterServletUpdate() {
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
		DumpsterDao entity1dao = new DumpsterDao();
		Dumpster entity1 = null;

		if(method.equals("search"))
		{
			try {
				entity1 = entity1dao.findByID(Integer.parseInt(request.getParameter("dumpster_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(entity1.getDumpster_id()!=null){
				request.setAttribute("dumpster", entity1);
				request.getRequestDispatcher("/jsps/dumpster/dumpster_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Dumpster not found");
				request.getRequestDispatcher("/jsps/dumpster/dumpster_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Dumpster form = new Dumpster();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setRestaurant_id(Integer.parseInt(info.get(2)));
			form.setCapacity(Float.parseFloat(info.get(3)));
			form.setDumpster_id(Integer.parseInt(request.getParameter("dumpster_id")));

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Dumpster Updated");
			request.getRequestDispatcher("/jsps/dumpster/dumpster_read_output.jsp").forward(request, response);
		}
	}
}



