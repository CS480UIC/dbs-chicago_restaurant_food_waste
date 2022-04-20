package order.domain;

/**
 * Order object
 * 
 * @author Justin Long
 * 
 */
public class Order {
	
	private Integer order_id;
	private Integer customer_id; 
	private Integer restaurant_id;
	/**
	 * @return the order_id
	 */
	public Integer getOrder_id() {
		return order_id;
	}
	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	/**
	 * @return the customer_id
	 */
	public Integer getCustomer_id() {
		return customer_id;
	}
	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
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
