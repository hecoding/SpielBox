package Negocio.plataforma.imp;
/**
 * 
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import Negocio.plataforma.Plataforma;
import Negocio.plataforma.SAPlataforma;
import Negocio.plataforma.TransferPlataforma;
import Negocio.programa.Programa;
import Negocio.programa.TransferPrograma;
import Negocio.programaPlataforma.ProgramaPlataforma;
import Negocio.programaPlataforma.ProgramaPlataformaId;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAPlataformaImp implements SAPlataforma {



	@Override
	public void crearPlataforma(TransferPlataforma datos)
			throws commandException {
		// TODO Auto-generated method stub
		boolean ret = false;
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();

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
	public void modificarPlataforma(TransferPlataforma datos) throws commandException {
		// TODO Auto-generated method stub
		boolean ret=false;
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();

		Query query = entityManager.createQuery("SELECT x FROM Plataforma x WHERE x.tipo = ?1");
		query.setParameter(1,datos.getTipo());
		if(query.getResultList().isEmpty()){ //si es vacia el resultado introduzco plataforma
			Plataforma modPla = entityManager.find(Plataforma.class, datos.getID());
			entityManager.lock(modPla, LockModeType.PESSIMISTIC_WRITE);
			modPla.setTipo(datos.getTipo());
			entityManager.merge(modPla);
			entityManager.getTransaction().commit();
			ret=true;
		}
		else{
			Plataforma modPla = entityManager.find(Plataforma.class, datos.getID());
			//lo busco para actualizar el transfer de la JTable (sino lo hago se pone el transfer que envió y no el que esta en BD
			datos.setTipo(modPla.getTipo());
			entityManager.getTransaction().rollback();
		}

		if(!ret)
			throw new commandException("Ya existe esa plataforma.");

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

		Plataforma delPal = entityManager.find(Plataforma.class, datos.getID());

		if(delPal != null){
			entityManager.remove(delPal);		
			entityManager.getTransaction().commit();
		}
		else
			entityManager.getTransaction().rollback();


		entityManager.close();
		entityFactoria.close();
	}

	@Override
	public void anadirProgramaPlataforma(TransferPlataforma platform,TransferPrograma program, Integer tam) throws commandException {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		boolean error=false;
		Plataforma addPlat = entityManager.find(Plataforma.class, platform.getID());
		Programa addProg = entityManager.find(Programa.class, program.getID());
		if(addPlat != null){ //existe plataforma			
			if(addProg != null){
				ProgramaPlataformaId ids= new ProgramaPlataformaId();
				ids.setPlataforma(platform.getID());
				ids.setPrograma(program.getID());
				ProgramaPlataforma search = entityManager.find(ProgramaPlataforma.class,ids);	
				if(search == null){	//SINO EXISTE PROGRAMA EN PLATAFORMA			
					ProgramaPlataforma prPl = new ProgramaPlataforma();				
					prPl.setPlataforma(addPlat);
					prPl.setPrograma(addProg);
					prPl.setEspacioTotal(tam);
					entityManager.persist(prPl);
					entityManager.getTransaction().commit();
					error=true; //todo ok
				}else
					entityManager.getTransaction().rollback();
			}
			else
				entityManager.getTransaction().rollback();
		}
		else
			entityManager.getTransaction().rollback();

		if(!error)
			throw new commandException("Ya existe esa programa en esa plataforma.");
		
		entityManager.close();
		entityFactoria.close();
	}

	@Override
	public void borrarProgramaPlataforma(TransferPlataforma platform, TransferPrograma program) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();

		Plataforma delPlat = entityManager.find(Plataforma.class, platform.getID());
		Programa delProg = entityManager.find(Programa.class, program.getID());
		if(delPlat != null){ //existe plataforma			
			if(delProg != null){ //existe programa
				ProgramaPlataformaId ids= new ProgramaPlataformaId();
				ids.setPlataforma(platform.getID());
				ids.setPrograma(program.getID());
				ProgramaPlataforma prPl = entityManager.find(ProgramaPlataforma.class,ids);	
				if(prPl != null){ //estan relacionados, por lo tanto lo borra
					entityManager.remove(prPl);
					entityManager.getTransaction().commit();
				}
				else
					entityManager.getTransaction().rollback();
			}
			else
				entityManager.getTransaction().rollback();
		}
		else
			entityManager.getTransaction().rollback();

		entityManager.close();
		entityFactoria.close();
	}

	@Override
	public ArrayList<TransferPrograma> mostrarPlataforma( // NO ESTA HECHO OJOOOOOOOOOOOOOOOOOOOOOOOOOOO
			TransferPlataforma datos) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();


		Query query = entityManager.createNativeQuery("SELECT PROGRAMA_ID FROM programaplataforma WHERE PLATAFORMA_ID =?1");
		query.setParameter(1,datos.getID());

		List<Object> pl = query.getResultList();
		ArrayList<TransferPrograma> programas = new ArrayList<TransferPrograma>();		
		for(int i = 0; i < pl.size(); i++){
			Integer primaryKey= Integer.parseInt(pl.get(i).toString());
			Programa p = entityManager.find(Programa.class, primaryKey);

			TransferPrograma all = new TransferPrograma();
			all.setID(p.getID());
			all.setFuncionalidad(p.getFuncionalidad());
			all.setNombre(p.getNombre());
			all.setRequisitos(p.getRequisitos());
			all.setVersion(p.getVersion());
			programas.add(all);
		}

		entityManager.close();
		entityFactoria.close();

		return programas;
	}

}
