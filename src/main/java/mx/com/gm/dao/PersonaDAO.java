package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public void listar(){
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);//recuperamos objetos de tipo persona no columnas
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println("p = " + p);
        }
    }
    
}
