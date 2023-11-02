package org.example.persistencia;

import org.example.logica.Platillos;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

//Creación de las clases controladoras: para la lógica y para la persistencia.

public class PlatillosJpaController {
    //Creación de los respectivos JPA Controller.
    private EntityManagerFactory emf = null;

    public PlatillosJpaController(){
        //Obtener unidad de persistencia
        this.emf = Persistence.createEntityManagerFactory("platillosPU");
    }

    public EntityManager getEntityManager() { //Devuelve un manejador de entidad
        return emf.createEntityManager();
    }

    //Métodos para interactuar con la BD
    public void create(Platillos platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();
    }

    public void destroy (int id){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillos platillo = em.find(Platillos.class, id);
        em.remove(platillo);
        em.getTransaction().commit();
    }

    public void edit (Platillos platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.merge(platillo);
        em.getTransaction().commit();
    }

    public List<Platillos> findPlatilloEntities(){
        EntityManager em = null;
        em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillos.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
}
