/**
 * 
 */
package Negocio.plataforma.imp;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;



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
		EntityManagerFactory entityFactoria = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager entityManager = entityFactoria.createEntityManager();
		entityManager.getTransaction().begin();
		
		try{
			//	Plataforma pl=  entityManager.find(Plataforma.class, datos.getTipo());
			Query query = entityManager.createQuery("SELECT x FROM Plataforma x WHERE x.tipo = ?1");
			query.setParameter(1,datos.getTipo());
			
			if(query.getResultList().isEmpty()){ //si es vacia el resultado introduzco plataforma
				System.out.println("Consulta vacia - Introduzco plataforma");
				Plataforma nuevo;
				if(datos.getTipo().equalsIgnoreCase("pepito"))
					nuevo= new Plataforma(3212,datos.getTipo());
				else
					nuevo= new Plataforma(1234,datos.getTipo());
				entityManager.persist(nuevo);
				entityManager.getTransaction().commit();
			}
			else{
				System.out.println("Existe plataforma envio mensaje error");
				entityManager.getTransaction().rollback();
			}
			
		}catch(Exception e){
			System.err.println("ENTRO EN LA EXCEPCION");
			entityManager.getTransaction().rollback();
		}
		

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