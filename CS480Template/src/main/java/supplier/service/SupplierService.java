package supplier.service;


import supplier.dao.SupplierDao;
import supplier.domain.Supplier;

/**
 * logic functions such as register, login
 * @author Vishvak Kumaran
 *
 */
public class SupplierService {
	private SupplierDao menuDao = new SupplierDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Supplier form) throws SupplierException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Supplier entity1 = menuDao.findByID(form.getSupplier_id());
		if(entity1.getSupplier_id()!=null && entity1.getSupplier_id().equals(form.getSupplier_id())) throw new SupplierException("This Supplier ID already exists");
		menuDao.add(form);
	}
	
}
