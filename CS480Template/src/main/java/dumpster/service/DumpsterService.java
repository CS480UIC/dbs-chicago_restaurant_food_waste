package dumpster.service;


import dumpster.dao.DumpsterDao;
import dumpster.domain.Dumpster;

/**
 * logic functions such as register, login
 * @author Lucas Beasley
 *
 */
public class DumpsterService {
	private DumpsterDao dumpsterDao = new DumpsterDao();
	
	/**
	 * register a order
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Dumpster form) throws DumpsterException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Dumpster dumpster1 = dumpsterDao.findByID(form.getDumpster_id());
		if(dumpster1.getDumpster_id()!=null && dumpster1.getDumpster_id().equals(form.getDumpster_id())) throw new DumpsterException("This dumpster id has been already created!");
		dumpsterDao.add(form);
	}
	
}
