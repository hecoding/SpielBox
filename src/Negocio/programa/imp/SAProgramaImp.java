package Negocio.programa.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Negocio.clasificacion.Clasificacion;
import Negocio.programa.Programa;
import Negocio.programa.ProgramaAlquiler;
import Negocio.programa.ProgramaPago;
import Negocio.programa.TransferPrograma;
import Negocio.programa.SAPrograma;
import Negocio.programa.TransferProgramaAlquiler;
import Negocio.programa.TransferProgramaPago;
import Presentacion.controlador.comandos.exceptions.commandException;


public class SAProgramaImp implements SAPrograma {

	@Override
	public void crearPrograma(TransferPrograma datos) throws commandException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();	

		em.getTransaction().begin();

		Query query = em.createQuery("SELECT x FROM Programa x WHERE x.nombre = ?1");
		Query query2 = em.createQuery("Select x FROM Clasificacion x WHERE x.dificultad = ?1");
		query.setParameter (1, datos.getNombre());
		query2.setParameter(1, datos.getClasificacion());

		boolean ret = false;
		Programa BOPrograma;
		if (query.getResultList().isEmpty()) {
			if(TransferProgramaPago.class.equals(datos.getClass())) {
				BOPrograma = new ProgramaPago ();
				((ProgramaPago) BOPrograma).setPrecio(((TransferProgramaPago)datos).getPrecioFinal());
			} else {
				BOPrograma = new ProgramaAlquiler ();
				((ProgramaAlquiler) BOPrograma).setPrecio(((TransferProgramaAlquiler)datos).getPrecioHora());
			}
			BOPrograma.setNombre(datos.getNombre());
			BOPrograma.setFuncionalidad(datos.getFuncionalidad());
			BOPrograma.setRequisitos(datos.getRequisitos());
			BOPrograma.setVersion(datos.getVersion());

			if(query2.getResultList().isEmpty()) {
				em.clear();
				em.getTransaction().rollback();
				throw new commandException("No existe esa clasificacion");
			} else {
				Clasificacion c = (Clasificacion) query2.getSingleResult();
				Clasificacion clasificacion = em.find(Clasificacion.class, c.getID());
				BOPrograma.setClasificacion(clasificacion);
			}
			em.persist(BOPrograma);
			em.getTransaction().commit();
			ret = true;
			datos.setID(BOPrograma.getID());
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}

		em.close();
		factory.close();
		if (!ret)
			throw new commandException("Ya existe este programa.");
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
	public void mostrarPrograma(TransferPrograma datos) throws commandException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		boolean ret=false;
		
		em.getTransaction().begin();
		Programa BOPrograma = em.find(Programa.class, datos.getID());

		if(BOPrograma != null){
			Clasificacion clasificacion = em.find(Clasificacion.class, BOPrograma.getClasificacion().getID());
			if(clasificacion != null){
				BOPrograma.setClasificacion(clasificacion);
				datos.setClasificacion(clasificacion.getDificultad());

				if(BOPrograma.getClass() == ProgramaPago.class){ //actualizamos el precio para mostrarlo luego
					Float precio = ((ProgramaPago) BOPrograma).getPrecio();
					((TransferProgramaPago) datos).setPrecioFinal(precio);
				}else{
					Float precio = ((ProgramaAlquiler) BOPrograma).getPrecio();
					((TransferProgramaAlquiler) datos).setPrecioHora(precio);
				}
				ret=true;
			}
		}
		if(!ret)
			throw new commandException("Ha ocurrido un problema para mostrar el programa");
		em.close();
		factory.close();
	}

	@Override
	public void modificarPrograma(TransferPrograma datos) throws commandException {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		Query query = em.createQuery("SELECT x FROM Programa x WHERE x.nombre = ?1");
		Query query2 = em.createQuery("SELECT x FROM Clasificacion x WHERE x.dificultad = ?2");
		query.setParameter(1,datos.getNombre());
		query2.setParameter(2, datos.getClasificacion());
		boolean ret = false;

		if (query.getResultList().isEmpty()) {
			Programa BOPrograma = em.find(Programa.class, datos.getID());
			em.lock(BOPrograma, LockModeType.PESSIMISTIC_WRITE);
			BOPrograma.setNombre(datos.getNombre());
			BOPrograma.setFuncionalidad(datos.getFuncionalidad());
			BOPrograma.setRequisitos(datos.getRequisitos());
			BOPrograma.setVersion(datos.getVersion());
			if(ProgramaAlquiler.class.equals(BOPrograma.getClass())) {
				((ProgramaAlquiler) BOPrograma).setPrecio(((TransferProgramaAlquiler)datos).getPrecioHora());
			} else {
				((ProgramaPago) BOPrograma).setPrecio(((TransferProgramaPago)datos).getPrecioFinal());
			}

			if(query2.getResultList().isEmpty()) {
				em.clear();
				em.getTransaction().rollback();
				throw new commandException("No existe esa clasificacion");
			} else {
				Clasificacion c = (Clasificacion) query2.getSingleResult();
				Clasificacion clasificacion = em.find(Clasificacion.class, c.getID());
				BOPrograma.setClasificacion(clasificacion);
				datos.setClasificacion(clasificacion.getDificultad());
				//System.err.println(datos.getClasificacion());
			}

			em.persist(BOPrograma);
			em.merge(BOPrograma);
			em.getTransaction().commit();
			ret = true;
		}
		else {
			Programa BOPrograma = em.find(Programa.class, datos.getID());
			//lo busco para actualizar el transfer de la JTable (sino lo hago se pone el transfer que envió y no el que esta en BD
			datos.setNombre(BOPrograma.getNombre());
			datos.setVersion(BOPrograma.getVersion());
			datos.setClasificacion(BOPrograma.getClasificacion().getDificultad());
			if(ProgramaAlquiler.class.equals(BOPrograma.getClass())) {
				((TransferProgramaAlquiler)datos).setPrecioHora(((ProgramaAlquiler) BOPrograma).getPrecio());
			} else {
				((TransferProgramaPago)datos).setPrecioFinal(((ProgramaPago) BOPrograma).getPrecio());
			}
			datos.setFuncionalidad(BOPrograma.getFuncionalidad());
			datos.setRequisitos(BOPrograma.getRequisitos());
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

		Query query = em.createQuery("SELECT p FROM Programa p");
		List<Programa> pl = query.getResultList();

		ArrayList<TransferPrograma> programas = new ArrayList<TransferPrograma>();

		for (int i = 0; i < pl.size(); i++){
			Programa p = (Programa) pl.get(i);
			if(ProgramaAlquiler.class.equals(p.getClass())) {
				TransferProgramaAlquiler all = new TransferProgramaAlquiler();
				all.setID (p.getID());
				all.setNombre(p.getNombre());
				all.setFuncionalidad(p.getFuncionalidad());
				all.setPrecioHora(((ProgramaAlquiler) p).getPrecio());
				all.setRequisitos(p.getRequisitos());
				all.setVersion(p.getVersion());
				programas.add(all);
			} else {
				TransferProgramaPago all = new TransferProgramaPago();
				all.setID (p.getID());
				all.setNombre(p.getNombre());
				all.setFuncionalidad(p.getFuncionalidad());
				all.setPrecioFinal(((ProgramaPago) p).getPrecio());
				all.setRequisitos(p.getRequisitos());
				all.setVersion(p.getVersion());
				programas.add(all);
			}
		}

		em.close();
		factory.close();

		return programas;
	}
}