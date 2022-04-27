package supplier.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import supplier.domain.Supplier;

/**
 * DDL functions performed in database
 */
public class SupplierDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "chicago_restaurant_food_waste"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "foodwaste"; //TODO change password

	public Supplier findByID(Integer ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Supplier supplier = new Supplier();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
		    String sql = "select * from supplier where supplier_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,ID);
		    ResultSet resultSet = preparestatement.executeQuery();
		    
		    while(resultSet.next()){
		    	Integer supplier_id = Integer.parseInt(resultSet.getString("suppler_id"));
		    	if(supplier_id == ID){
		    		supplier.setSupplier_id(Integer.parseInt(resultSet.getString("supplier_id")));
		    		supplier.setRestaurant_id(Integer.parseInt(resultSet.getString("restaurant_id")));
		    		supplier.setAddress(resultSet.getString("address"));	
		    		supplier.setPhone_number(resultSet.getString("phone_number"));	
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return supplier;
	}	
	
	/**
	 * insert Supplier
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Supplier form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "insert into supplier (supplier_id,restaurant_id, address, phone_number) values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getSupplier_id());
		    preparestatement.setInt(2,form.getRestaurant_id());
		    preparestatement.setString(3,form.getAddress());
		    preparestatement.setString(4,form.getPhone_number());
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
	public void update(Supplier form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "UPDATE supplier SET restaurant_id = ?, phone_number = ? where supplier_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getRestaurant_id());
			preparestatement.setString(2,form.getPhone_number());
		    preparestatement.setInt(3,form.getSupplier_id());
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
			
			String sql = "delete from supplier where supplier_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,ID);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
