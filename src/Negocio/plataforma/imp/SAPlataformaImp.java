/**
 * 
 */
package Negocio.plataforma.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import Negocio.plataforma.Plataforma;
import Negocio.plataforma.SAPlataforma;
import Negocio.plataforma.TransferPlataforma;
import Negocio.programa.Programa;
import Negocio.programa.TransferPrograma;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAPlataformaImp implements SAPlataforma {

	

	@Override
	public void crearPlataforma(TransferPlataforma datos) throws commandException {
		// TODO Auto-generated method stub
		
		boolean ret=false;
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		
			//	Plataforma pl=  entityManager.find(Plataforma.class, datos.getTipo());
			Query query = entityManager.createQuery("SELECT x FROM Plataforma x WHERE x.tipo = ?1");
			query.setParameter(1,datos.getTipo());
			Plataforma nuevo;
			if(query.getResultList().isEmpty()){ //si es vacia el resultado introduzco plataforma
				nuevo= new Plataforma();
				nuevo.setTipo(datos.getTipo());
				entityManager.persist(nuevo);
				entityManager.getTransaction().commit();
				ret=true;
				datos.setID(nuevo.getID());
			}
			else
				entityManager.getTransaction().rollback();
		
		
		if(!ret)
			throw new commandException("Ya existe esa plataforma.");

		entityManager.close();
		entityFactoria.close();			
	}

	@Override
	public void modificarPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		Plataforma modPla = entityManager.find(Plataforma.class, datos.getID());
		modPla.setTipo(datos.getTipo());
		entityManager.merge(modPla);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityFactoria.close();
	}

	@Override
	public ArrayList<TransferPlataforma> mostrarPlataformas() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createQuery("SELECT p FROM Plataforma p");
		List<Object> pl = query.getResultList();
		ArrayList<TransferPlataforma> plataformas = new ArrayList<TransferPlataforma>();
		for(int i = 0; i < pl.size(); i++){
			Plataforma p = (Plataforma) pl.get(i);
			TransferPlataforma all = new TransferPlataforma();
			all.setID(p.getID());
			all.setTipo(p.getTipo());
			plataformas.add(all);
		}
		
		entityManager.close();
		entityFactoria.close();
		
		return plataformas;
	}

	@Override
	public void eliminarPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		System.err.println(datos.getID());
		Plataforma delPal = entityManager.find(Plataforma.class, datos.getID());
		System.err.println(delPal.getTipo());
		entityManager.remove(delPal);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityFactoria.close();
	}

	@Override
	public void anadirProgramaPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarProgramaPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<TransferPrograma> mostrarPlataforma( // NO ESTA HECHO OJOOOOOOOOOOOOOOOOOOOOOOOOOOO
			TransferPlataforma datos) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createQuery("SELECT x FROM Plataforma x WHERE x.tipo = ?1");
		query.setParameter(1,datos.getTipo());
		List<Object> pl = query.getResultList();
		ArrayList<TransferPrograma> programas = new ArrayList<TransferPrograma>();
		for(int i = 0; i < pl.size(); i++){
			Programa p = (Programa) pl.get(i);
			TransferPrograma all = new TransferPrograma();
			all.setID(p.getID());
			all.setFuncionalidad(p.getFuncionalidad());
			all.setNombre(p.getNombre());
			all.setPrecio(p.getPrecio());
			all.setRequisitos(p.getRequisitos());
			all.setVersion(p.getVersion());
			programas.add(all);
		}
		
		entityManager.close();
		entityFactoria.close();
		
		return programas;
	}




}