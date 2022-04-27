package food_waste.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import food_waste.domain.FoodWaste;

/**
 * DDL functions performed in database
 */
public class FoodWasteDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "chicago_restaurant_food_waste"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "foodwaste"; //TODO change password

	public FoodWaste findByID(Integer ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		FoodWaste food_waste = new FoodWaste();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
		    String sql = "select * from food_waste where food_waste_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,ID);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer food_waste_id = Integer.parseInt(resultSet.getString("food_waste_id"));
		    	if(food_waste_id == ID){
		    		food_waste.setFood_waste_id(Integer.parseInt(resultSet.getString("food_waste_id")));
		    		food_waste.setAvg_daily_waste(Float.parseFloat(resultSet.getString("avg_daily_waste")));
		    		food_waste.setRestaurant_id(Integer.parseInt(resultSet.getString("restaurant_id")));		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return food_waste;
	}	
	
	/**
	 * insert FoodWaste
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(FoodWaste form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "insert into food_waste (food_waste_id,restaurant_id, avg_daily_waste) values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getFood_waste_id());
		    preparestatement.setInt(2,form.getRestaurant_id());
		    preparestatement.setFloat(3,form.getAvg_daily_waste());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void update(FoodWaste form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "UPDATE food_waste SET restaurant_id = ?, avg_daily_waste = ? where food_waste_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getRestaurant_id());
			preparestatement.setFloat(2,form.getAvg_daily_waste());
		    preparestatement.setInt(3,form.getFood_waste_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(Integer ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "delete from food_waste where food_waste_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,ID);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
