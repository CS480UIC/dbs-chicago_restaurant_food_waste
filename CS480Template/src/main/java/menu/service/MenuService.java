package menu.service;


import menu.dao.MenuDao;
import menu.domain.Menu;

/**
 * logic functions such as register, login
 * @author Niko Castellana
 *
 */
public class MenuService {
	private MenuDao menuDao = new MenuDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Menu form) throws MenuException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Menu entity1 = menuDao.findByID(form.getMenu_id());
		if(entity1.getMenu_id()!=null && entity1.getMenu_id().equals(form.getMenu_id())) throw new MenuException("This menu has been registered!");
		menuDao.add(form);
	}
	
}
