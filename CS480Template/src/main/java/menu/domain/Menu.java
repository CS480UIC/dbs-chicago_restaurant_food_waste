package menu.domain;

/**
 * Menu object
 * 
 * @author Niko Castellana
 * 
 */
public class Menu {
	
	private Integer menu_id;
	private Integer restaurant_id;
	private String menu_item;
	/**
	 * @return the menu_id
	 */
	public Integer getMenu_id() {
		return menu_id;
	}
	/**
	 * @param menu_id the menu_id to set
	 */
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
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
	 * @return the menu_item
	 */
	public String getMenu_item() {
		return menu_item;
	}
	/**
	 * @param menu_item the menu_item to set
	 */
	public void setMenu_item(String menu_item) {
		this.menu_item = menu_item;
	}
	
	
	


}
