package garbage_truck.service;


import garbage_truck.dao.GarbageTruckDao;
import garbage_truck.domain.GarbageTruck;

/**
 * logic functions such as register, login
 * @author Lucas Beasley
 *
 */
public class GarbageTruckService {
	private GarbageTruckDao garbageTruckDao = new GarbageTruckDao();
	
	/**
	 * register a order
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(GarbageTruck form) throws GarbageTruckException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		GarbageTruck entity1 = garbageTruckDao.findByID(form.getTruck_id());
		if(entity1.getTruck_id()!=null && entity1.getTruck_id().equals(form.getTruck_id())) throw new GarbageTruckException("This truck id has been already created!");
		garbageTruckDao.add(form);
	}
	
}
