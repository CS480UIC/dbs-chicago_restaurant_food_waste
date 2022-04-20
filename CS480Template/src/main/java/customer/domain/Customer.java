package customer.domain;

/**
 * Customer object
 * 
 * @author Justin Long
 * 
 */
public class Customer {

	
	private Integer customer_id;
	private String email_address; 
	private String name;
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
	 * @return the email_address
	 */
	public String getEmail_address() {
		return email_address;
	}
	/**
	 * @param email_address the email_address to set
	 */
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
