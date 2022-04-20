package order.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import order.domain.Order;

/**
 * DDL functions performed in database
 */
public class OrderDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "chicago_restaurant_food_waste"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "foodwaste"; //TODO change password

	public Order findByID(Integer id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Order order1 = new Order();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
		    String sql = "select * from `order` where order_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, id);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer order_id = Integer.parseInt(resultSet.getString("order_id"));
		    	if(order_id == id){
		    		order1.setOrder_id(order_id);
		    		order1.setCustomer_id(Integer.parseInt(resultSet.getString("customer_id")));
		    		order1.setRestaurant_id(Integer.parseInt(resultSet.getString("restaurant_id")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return order1;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Order form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "insert into `order` (order_id, customer_id, restaurant_id) values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getOrder_id());
		    preparestatement.setInt(2,form.getCustomer_id());
		    preparestatement.setInt(3,form.getRestaurant_id());
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
	
	public void update(Order form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "UPDATE `order` SET customer_id = ?, restaurant_id = ? where order_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getCustomer_id());
			preparestatement.setInt(2,form.getRestaurant_id());
		    preparestatement.setInt(3,form.getOrder_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param ID
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	
	public void delete(Integer ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "delete from `order` where order_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,ID);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
