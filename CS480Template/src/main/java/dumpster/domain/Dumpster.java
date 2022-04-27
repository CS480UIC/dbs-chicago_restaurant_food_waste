package dumpster.domain;

/**
 * Order object
 * 
 * @author Lucas Beasley
 * 
 */
public class Dumpster {
	
	private Integer dumpster_id;
	private Integer restaurant_id; 
	private float capacity;
	/**
	 * @return the dumpster_id
	 */
	public Integer getDumpster_id() {
		return dumpster_id;
	}
	/**
	 * @param dumpster_id the dumpster_id to set
	 */
	public void setDumpster_id(Integer dumpster_id) {
		this.dumpster_id = dumpster_id;
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
	 * @return the capacity_id
	 */
	public float getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	
	
}
