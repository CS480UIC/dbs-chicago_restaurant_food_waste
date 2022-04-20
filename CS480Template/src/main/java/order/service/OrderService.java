package order.service;


import order.dao.OrderDao;
import order.domain.Order;

/**
 * logic functions such as register, login
 * @author Justin Long
 *
 */
public class OrderService {
	private OrderDao orderDao = new OrderDao();
	
	/**
	 * register a order
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Order form) throws OrderException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Order entity1 = orderDao.findByID(form.getOrder_id());
		if(entity1.getOrder_id()!=null && entity1.getOrder_id().equals(form.getOrder_id())) throw new OrderException("This order id has been already created!");
		orderDao.add(form);
	}
	
}
