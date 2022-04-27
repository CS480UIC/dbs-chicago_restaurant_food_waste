package supplier.domain;

/**
 * Supplier object
 * 
 * @author Vishvak Kumaran
 * 
 */
public class Supplier {
	
	private Integer supplier_id;
	private Integer restaurant_id;
	private String address;
	private String phone_number;
	/**
	 * @return the supplier_id
	 */
	public Integer getSupplier_id() {
		return supplier_id;
	}
	/**
	 * @param supplier_id the supplier_id to set
	 */
	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	


}
