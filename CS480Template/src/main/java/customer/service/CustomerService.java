package customer.service;


import java.util.List;

import customer.dao.CustomerDao;
import customer.domain.Customer;

/**
 * logic functions such as register, login
 * @author Justin Long
 *
 */
public class CustomerService {
	private CustomerDao customerDao = new CustomerDao();
	
	/**
	 * register a Customer
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Customer form) throws CustomerException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Customer entity1 = customerDao.findByID(form.getCustomer_id());
		if(entity1.getCustomer_id()!=null && entity1.getCustomer_id().equals(form.getCustomer_id())) throw new CustomerException("This customer has been registered!");
		customerDao.add(form);
	}
	
	public List<Object> findHighCustomers() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return customerDao.findHighCustomers();
		
	}
	
	public List<Object> findConcatCustomers() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return customerDao.findConcatCustomers();
		
	}
}
