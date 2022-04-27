package garbage_truck.domain;

/**
 * Order object
 * 
 * @author Lucas Beasley
 * 
 */
public class GarbageTruck {
	
	private Integer truck_id;
	private Integer restaurant_id;
	private Integer truck_capacity;
	/**
	 * @return the truck_id
	 */
	public Integer getTruck_id() {
		return truck_id;
	}
	/**
	 * @param truck_id the truck_id to set
	 */
	public void setTruck_id(Integer truck_id) {
		this.truck_id = truck_id;
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
	/**
	 * @return the truck_capacity
	 */
	public Integer getTruck_capacity() {
		return truck_capacity;
	}
	/**
	 * @param truck_capacity the truck_capacity to set
	 */
	public void setTruck_capacity(Integer truck_capacity) {
		this.truck_capacity = truck_capacity;
	}
	
	
	
}
