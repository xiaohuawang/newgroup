package main1;

import javax.persistence.EntityManager;

import customTools.DBUtil;

public class test {



	public static void main(String[] args) {
		System.out.println("1");
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		System.out.println("2");
		try {
	
		
			
			
			
			System.out.println("3");
			model.Goshuser abc = em.find(model.Goshuser.class, (long)2);
			System.out.println(abc.getEmail());
		} catch (Exception e){
			System.out.println(e);
		} finally {
			System.out.println(4);
			em.close();
			System.out.println("cerrado!");
		}
	}

}