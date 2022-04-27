package dumpster.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import dumpster.domain.Dumpster;

/**
 * DDL functions performed in database
 */
public class DumpsterDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "chicago_restaurant_food_waste"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "foodwaste"; //TODO change password

	public Dumpster findByID(Integer id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Dumpster dumpster1 = new Dumpster();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
		    String sql = "select * from `dumpster` where dumpster_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, id);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer dumpster_id = Integer.parseInt(resultSet.getString("dumpster_id"));
		    	if(dumpster_id == id){
		    		dumpster1.setDumpster_id(dumpster_id);
		    		dumpster1.setRestaurant_id(Integer.parseInt(resultSet.getString("restaurant_id")));
		    		dumpster1.setCapacity(Float.parseFloat(resultSet.getString("capacity")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return dumpster1;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Dumpster form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "insert into `dumpster` (dumpster_id, restaurant_id, capacity) values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getDumpster_id());
		    preparestatement.setInt(2,form.getRestaurant_id());
		    preparestatement.setFloat(3,form.getCapacity());
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
	
	public void update(Dumpster form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste", MySQL_user, MySQL_password);
			
			String sql = "UPDATE `dumpster` SET restaurant_id = ?, capacity = ? where dumpster_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getRestaurant_id());
			preparestatement.setFloat(2,form.getCapacity());
		    preparestatement.setInt(3,form.getDumpster_id());
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
			
			String sql = "delete from `dumpster` where dumpster_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,ID);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
