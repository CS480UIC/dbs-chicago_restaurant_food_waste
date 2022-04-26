package menu.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import menu.dao.MenuDao;
import menu.domain.Menu;


/**
 * Servlet implementation class UserServlet
 */

public class MenuServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServletDelete() {
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
		MenuDao menuDao = new MenuDao();
		Menu menu = null;
		if(method.equals("search"))
		{
			try {
				menu = menuDao.findByID(Integer.parseInt(request.getParameter("menu_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(menu.getMenu_id()!=null){
						//System.out.println(menu);
						request.setAttribute("menu", menu);
						request.getRequestDispatcher("/jsps/menu/menu_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Menu not found");
				request.getRequestDispatcher("/jsps/menu/menu_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				menuDao.delete(Integer.parseInt(request.getParameter("menu_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Menu Deleted");
			request.getRequestDispatcher("/jsps/menu/menu_read_output.jsp").forward(request, response);
		}
	}
}



