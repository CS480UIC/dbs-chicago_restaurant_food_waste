package entity1.service;


import entity1.dao.RestaurantDao;
import entity1.domain.Restaurant;

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
	public void create(Restaurant form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Restaurant entity1 = entity1Dao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new Entity1Exception("This user name has been registered!");
		entity1Dao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void login(Restaurant form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Restaurant user = entity1Dao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new Entity1Exception("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new Entity1Exception(" The password is not right");
		
	}
}
