package DB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import customTools.DBUtil;

import model.Hcclass;
import model.Hcuser;



public class HcclassDB {

	
	public static List<Hcclass> getAllProducts()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Hcclass p ORDER BY p.crn";
		List<Hcclass> hcclass = null;
		try
		{
			Query query = em.createQuery(queryStr);
			hcclass =  query.getResultList();
			System.out.println("size = " + hcclass.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return hcclass;
	}
	
	/*
	public static Hcclass getClass(String semester)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try
		{
			
			Hcclass hcclass = em.find(Product.class, id);
			//System.out.println(products);
			return products;
			
			
		}
		finally
		{
			em.close();
		}
		
	}
	*/

	
	
	public static List<Hcclass> getsomeClass(String semester)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Hcclass p where p.semester = "  + semester;
		
		//String queryStr = "SELECT l FROM Shoplineitem l where l.order_id = " + oid;
		List<Hcclass> hcclass = null;
		try
		{
			Query query = em.createQuery(queryStr);
			hcclass =  query.getResultList();
			System.out.println("size = " + hcclass.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return hcclass;
	}
	
	
	public static List<Hcclass> getinstructor(Hcuser user) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Hcclass p where p.hcuser = :user"  ;
		
		//String queryStr = "SELECT l FROM Shoplineitem l where l.order_id = " + oid;
		List<Hcclass> hcclass = null;
        
		
		
		try
		{
			Query query = em.createQuery(queryStr)
					.setParameter("user", user);
			hcclass =  query.getResultList();
			System.out.println("products.size = " + hcclass.size());
			System.out.println("size = " + user.getType() + user);
		}
		
		
		
		/*
		try
		{
			Query query = em.createQuery(queryStr);
			hcclass =  query.getResultList();
			System.out.println("size = " + hcclass.size());
		}
		*/
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return hcclass;
	}
	
	

	
}
