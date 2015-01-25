/**
 * 
 */
package Negocio.plataforma.imp;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.persistence.Persistence;

import Negocio.plataforma.Plataforma;
import Negocio.plataforma.SAPlataforma;
import Negocio.plataforma.TransferPlataforma;
import Negocio.programa.TransferPrograma;
import Negocio.programaPlataforma.ProgramaPlataforma;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAPlataformaImp implements SAPlataforma {

	@Override
	public String crearPlataforma(TransferPlataforma datos)
			throws commandException {
		// TODO Auto-generated method stub
		
		String mensaje;
		javax.persistence.EntityManagerFactory entityFactoria =Persistence.createEntityManagerFactory("SpielBox");
		javax.persistence.EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		
	//	Plataforma pl=  entityManager.find(Plataforma.class, datos.getTipo());
		Plataforma pl= new Plataforma();
		pl.setTipo(datos.getTipo());
		pl.setId(132);
		//Collection<ProgramaPlataforma> programasPl= new ArrayList<ProgramaPlataforma>();
		//pl.setAsociacion(programasPl);
		entityManager.persist(pl);
		entityManager.getTransaction().commit();	
		
		entityManager.close();
		entityFactoria.close();	
		
		
		return "OK";
	}

	@Override
	public String modificarPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mostrarPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarPlataformas(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPlataforma(TransferPlataforma datos) {
		// TODO Auto-generated method stub
		
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
	public ArrayList<TransferPrograma> mostrarProgramasPlataforma(
			TransferPlataforma datos) {
		// TODO Auto-generated method stub
		return null;
	}




}