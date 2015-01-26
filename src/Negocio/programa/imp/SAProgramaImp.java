/**
 * 
 */
package Negocio.programa.imp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Negocio.programa.Programa;
import Negocio.programa.TransferPrograma;
import Negocio.programa.SAPrograma;


public class SAProgramaImp implements SAPrograma {

	@Override
	public void crearPrograma(TransferPrograma datos) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Programa BOPrograma = em.find(Programa.class, datos.getID());
		
		if (BOPrograma == null) {
			BOPrograma = new Programa ();
			BOPrograma.setNombre(datos.getNombre());
			BOPrograma.setFuncionalidad(datos.getFuncionalidad());
			BOPrograma.setRequisitos(datos.getRequisitos());
			BOPrograma.setVersion(datos.getVersion());
			BOPrograma.setPrecio(datos.getPrecio());
			em.persist(BOPrograma);
			em.getTransaction().commit();
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}
	}

	@Override
	public void eliminarPrograma(TransferPrograma datos) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Programa BOPrograma = em.find(Programa.class, datos.getID());
		
		if (BOPrograma != null) {
			em.remove(BOPrograma);
			em.getTransaction().commit();
		}
		else {
			em.getTransaction().rollback();
		}
	}

	@Override
	public TransferPrograma mostrarPrograma(TransferPrograma datos) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Programa BOPrograma = em.find(Programa.class, datos.getID());
		
		if (BOPrograma != null) {
			return datos;
		} 
		else return null;
	}

	@Override
	public void modificarPrograma(TransferPrograma datos) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Programa BOPrograma = em.find(Programa.class, datos.getID());
		
		if (BOPrograma != null) {
			BOPrograma = new Programa ();
			BOPrograma.setNombre(datos.getNombre());
			BOPrograma.setFuncionalidad(datos.getFuncionalidad());
			BOPrograma.setRequisitos(datos.getRequisitos());
			BOPrograma.setVersion(datos.getVersion());
			BOPrograma.setPrecio(datos.getPrecio());
			em.persist(BOPrograma);
			
			em.persist(BOPrograma);
			em.getTransaction().commit();
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}
	}

	@Override
	public ArrayList<TransferPrograma> mostrarProgramas() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		TypedQuery query = em.createNamedQuery("SELECT * FROM Programa p", Programa.class);
		
		return (ArrayList<TransferPrograma>) query.getResultList(); // boom headshot MIRALO JEFF HIJOPUTA
	}
}