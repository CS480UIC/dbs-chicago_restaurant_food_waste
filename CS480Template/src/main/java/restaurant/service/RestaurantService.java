package restaurant.service;


import java.util.List;

import restaurant.dao.RestaurantDao;
import restaurant.domain.Restaurant;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class RestaurantService {
	private RestaurantDao entity1Dao = new RestaurantDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Restaurant form) throws RestaurantException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Restaurant entity1 = entity1Dao.findByID(form.getRestaurant_id());
		if(entity1.getRestaurant_id()!=null && entity1.getRestaurant_id().equals(form.getRestaurant_id())) throw new RestaurantException("This restaurant has been registered!");
		entity1Dao.add(form);
	}

	public List<Object> findAvgWasteRestaurant() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// TODO Auto-generated method stub
		return entity1Dao.findAvgWasteRestaurant();
	}

	public List<Object> findConcatRestaurant() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// TODO Auto-generated method stub
		return entity1Dao.findConcatRestaurant();
	}

	public List<Object> findDateRestaurant() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// TODO Auto-generated method stub
		return entity1Dao.findDateRestaurant();
	}

	public List<Object> findLowSupplierCountRestaurant() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// TODO Auto-generated method stub
		return entity1Dao.findLowSupplierCountRestaurant();
	}
	
}
