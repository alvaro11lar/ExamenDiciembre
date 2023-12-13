package ejercicio4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 
    
    public static EntityManager getEntityManager(String nombreBaseDatos) { 
    	EntityManagerFactory em =  Persistence.createEntityManagerFactory(nombreBaseDatos);
    	return em.createEntityManager();
    }
   
}
