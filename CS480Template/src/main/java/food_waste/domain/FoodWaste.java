package food_waste.domain;

/**
 * FoodWaste object
 * 
 * @author Vishvak Kumaran
 * 
 */
public class FoodWaste {
	
	private Integer food_waste_id;
	private Float avg_daily_waste;
	private Integer restaurant_id;
	/**
	 * @return the food_waste_id
	 */
	public Integer getFood_waste_id() {
		return food_waste_id;
	}
	/**
	 * @param food_waste_id the food_waste_id to set
	 */
	public void setFood_waste_id(Integer food_waste_id) {
		this.food_waste_id = food_waste_id;
	}
	/**
	 * @return the avg_daily_waste
	 */
	public Float getAvg_daily_waste() {
		return avg_daily_waste;
	}
	/**
	 * @param avg_daily_waste the avg_daily_waste to set
	 */
	public void setAvg_daily_waste(Float avg_daily_waste) {
		this.avg_daily_waste = avg_daily_waste;
	}
	/**
	 * @return the restaurant_id
	 */
	public Integer getRestaurant_id() {
		return restaurant_id;
	}
	/**
	 * @param restaurant_id the restaurant_id to set
	 */
	public void setRestaurant_id(Integer restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
	


}
