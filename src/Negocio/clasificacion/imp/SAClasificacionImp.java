package Negocio.clasificacion.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Negocio.clasificacion.Clasificacion;
import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Negocio.programa.Programa;
import Negocio.programa.TransferPrograma;
import Presentacion.controlador.comandos.exceptions.commandException;

public class SAClasificacionImp implements SAClasificacion {
	
	public void crearClasificacion(TransferClasificacion transfer) throws commandException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("SELECT x FROM Clasificacion x WHERE x.dificultad = ?1");
		query.setParameter (1, transfer.getDificultad());
		
		Clasificacion BOClasificacion;
		boolean ret = false;
		
		if (query.getResultList().isEmpty()) {
			BOClasificacion = new Clasificacion ();
			BOClasificacion.setDificultad(transfer.getDificultad());
			
			em.persist(BOClasificacion);
			em.getTransaction().commit();
			ret = true;
			transfer.setID(BOClasificacion.getID());
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

	public void modificarClasificacion(TransferClasificacion transfer) throws commandException {
		// TODO Auto-generated method stub
		boolean ret=false;
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
				
		Query query = entityManager.createQuery("SELECT x FROM Clasificacion x WHERE x.dificultad = ?1");
		query.setParameter(1,transfer.getDificultad());
		if(query.getResultList().isEmpty()){ //si es vacia el resultado introduzco plataforma
			Clasificacion BOClasificacion = entityManager.find(Clasificacion.class, transfer.getID());
			entityManager.lock(BOClasificacion, LockModeType.PESSIMISTIC_WRITE);
			BOClasificacion.setDificultad(transfer.getDificultad());
			entityManager.merge(BOClasificacion);
			entityManager.getTransaction().commit();
			ret=true;
		} else {
			Clasificacion BOClasificacion = entityManager.find(Clasificacion.class, transfer.getID());
			//lo busco para actualizar el transfer de la JTable (sino lo hago se pone el transfer que envió y no el que esta en BD
			transfer.setDificultad(BOClasificacion.getDificultad());
			entityManager.getTransaction().rollback();
		}
					
		if(!ret)
			throw new commandException("Ya existe esa Clasificación.");
				
		entityManager.close();
		entityFactoria.close();
	}

	public ArrayList<TransferPrograma> mostrarClasificacion (TransferClasificacion transfer) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		Query query = em.createQuery("SELECT p FROM Programa p");
		List<Programa> cl = query.getResultList();
		
		ArrayList<TransferPrograma> programas = new ArrayList<TransferPrograma>();
		for (int i = 0; i < cl.size(); i++){
			Programa c = cl.get(i);
			if(c.getClasificacion().getID() == BOClasificacion.getID()){
				TransferPrograma all = new TransferPrograma();
				all.setNombre(c.getNombre());
				all.setRequisitos(c.getRequisitos());
				all.setVersion(c.getVersion());
				all.setClasificacion(BOClasificacion.getDificultad());
				all.setFuncionalidad(c.getFuncionalidad());
				programas.add(all);
			}
		}
				
		em.close();
		factory.close();
		return programas;
	}

	public ArrayList<TransferClasificacion> mostrarClasificaciones() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("SELECT c FROM Clasificacion c");
		List<Clasificacion> cl = query.getResultList();
		
		ArrayList<TransferClasificacion> clasificaciones = new ArrayList<TransferClasificacion>();
		
		for (int i = 0; i < cl.size(); i++){
			Clasificacion c = (Clasificacion) cl.get(i);
			TransferClasificacion all = new TransferClasificacion();
			all.setID (c.getID());
			all.setDificultad (c.getDificultad());
			clasificaciones.add(all);
		}
		
		em.close();
		factory.close();
		
		return clasificaciones;
	}

	public void eliminarClasificacion (TransferClasificacion transfer) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		
		if (BOClasificacion != null) {
			em.remove(BOClasificacion);
			em.getTransaction().commit();
		}
		else {
			em.getTransaction().rollback();
		}
		
		em.close();
		factory.close();
	}
}