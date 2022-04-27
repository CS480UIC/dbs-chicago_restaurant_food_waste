package restaurant.domain;

public class FoodWasteJoin {
	private String name;
	private String address;
	private float avg_daily_waste;
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
	 * @return the avg_daily_waste
	 */
	public float getAvg_daily_waste() {
		return avg_daily_waste;
	}
	/**
	 * @param avg_daily_waste the avg_daily_waste to set
	 */
	public void setAvg_daily_waste(float avg_daily_waste) {
		this.avg_daily_waste = avg_daily_waste;
	}
}
