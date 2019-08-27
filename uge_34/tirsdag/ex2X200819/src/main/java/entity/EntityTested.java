/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author slamr
 */
public class EntityTested {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        
        Customer cu1 = new Customer("Ib","Hansen");
        Customer cu2 = new Customer("Hans","Pedersen");
        
        try {
      em.getTransaction().begin();
      em.persist(cu1);
      em.persist(cu2);
      //em.persist(book3);
      
      em.getTransaction().commit();
      //Verify that books are managed and has been given a database id
      //System.out.println(book1.getId());
      //System.out.println(book2.getId());
       	 
    	}finally{
        	em.close();
    	}

        
    }
    
}
