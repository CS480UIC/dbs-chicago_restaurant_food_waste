package food_waste.service;


import java.util.List;

import food_waste.dao.FoodWasteDao;
import food_waste.domain.FoodWaste;

/**
 * logic functions such as register, login
 * @author Vishvak Kumaran
 *
 */
public class FoodWasteService {
	private FoodWasteDao foodWasteDao = new FoodWasteDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(FoodWaste form) throws FoodWasteException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		FoodWaste entity1 = foodWasteDao.findByID(form.getFood_waste_id());
		if(entity1.getFood_waste_id() != null && entity1.getFood_waste_id() == form.getFood_waste_id()) throw new FoodWasteException("This food waste id already exists!");
		foodWasteDao.add(form);
	}

	public List<Object> findFoodWasteTruck() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// TODO Auto-generated method stub
		return foodWasteDao.findFoodWasteTruck();
	}

	public List<Object> findLowFoodWaste() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// TODO Auto-generated method stub
		return foodWasteDao.findLowFoodWaste();
	}
	
}
