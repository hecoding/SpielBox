package Negocio.programa.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Negocio.programa.Programa;
import Negocio.programa.TransferPrograma;
import Negocio.programa.SAPrograma;
import Presentacion.controlador.comandos.exceptions.commandException;


public class SAProgramaImp implements SAPrograma {

	@Override
	public void crearPrograma(TransferPrograma datos) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("SELECT x FROM Programa x WHERE x.nombre = ?1");
		query.setParameter (1, datos.getNombre());
		
		Programa BOPrograma;
		
		if (query.getResultList().isEmpty()) {
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
		
		em.close();
		factory.close();
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
		
		em.close();
		factory.close();
	}

	@Override
	public TransferPrograma mostrarPrograma(TransferPrograma datos) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Programa BOPrograma = em.find(Programa.class, datos.getID());
		
		em.close();
		factory.close();
		
		if (BOPrograma != null) {
			return datos;
		} 
		else return null;
	}

	@Override
	public void modificarPrograma(TransferPrograma datos) throws commandException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Programa BOPrograma = em.find(Programa.class, datos.getID());
		boolean ret = false;
		
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
			ret = true;
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}
		
		em.close();
		factory.close();
		
		if (!ret)
			throw new commandException("Ya existe esta clasificación.");
	}

	@Override
	public ArrayList<TransferPrograma> mostrarProgramas() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		TypedQuery<Programa> query = em.createNamedQuery("SELECT p FROM Programa p", Programa.class);
		List<Programa> pl = query.getResultList();
		
		ArrayList<TransferPrograma> programas = new ArrayList<TransferPrograma>();
		
		for (int i = 0; i < pl.size(); i++){
			Programa p = (Programa) pl.get(i);
			TransferPrograma all = new TransferPrograma();
			all.setID (p.getID());
			all.setNombre(p.getNombre());
			all.setFuncionalidad(p.getFuncionalidad());
			all.setPrecio(p.getPrecio());
			all.setRequisitos(p.getRequisitos());
			all.setVersion(p.getVersion());
			
			programas.add(all);
		}
		
		em.close();
		factory.close();
		
		return programas;
	}
}