package DB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import customTools.DBUtil;
import model.Hcclass;
import model.Hccourse;
import model.Hcdept;

public class HccourseDB {
	
	
	public static List<Hccourse> getinstructor(Hcdept dept) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Hccourse p where p.hcdept = :dept"  ;
		
		//String queryStr = "SELECT l FROM Shoplineitem l where l.order_id = " + oid;
		List<Hccourse> hccourse = null;
        
		
		
		try
		{
			Query query = em.createQuery(queryStr)
					.setParameter("dept", dept);
			hccourse =  query.getResultList();
			System.out.println("hccourse.size = " + hccourse.size());
			//System.out.println("size = " + user.getType() + user);
		}
		
		
		
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return hccourse;
	}
	

}
