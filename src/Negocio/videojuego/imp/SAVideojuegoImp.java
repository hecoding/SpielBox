package Negocio.videojuego.imp;

import java.util.ArrayList;

import Integracion.factoria.DAOFactoria;
import Integracion.transaction.Transaction;
import Integracion.transactionManager.TransactionManager;
import Integracion.videojuego.DAOVideojuego;
import Negocio.videojuego.SAVideojuego;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.comandos.exceptions.commandException;

public class SAVideojuegoImp implements SAVideojuego {

	public void crearVideojuego(TransferVideojuego transfer) throws commandException {
		Transaction transaccion = TransactionManager.getInstance().nuevaTransaccion();
		transaccion.start();
		DAOVideojuego dao = DAOFactoria.getInstancia().nuevoDaoVideojuego();

		if (!dao.buscarIDVideojuego(transfer.getID())) {
			dao.crearVideojuego(transfer);
			transaccion.commit();
		} else {
			transaccion.rollback();
			throw new commandException("ERROR: Videojuego existente");
		}
		TransactionManager.getInstance().eliminarTransaccion();//Esto está bien
	}

	public void modificarVideojuego(TransferVideojuego transfer) throws commandException {
		System.err.println(transfer.getID()+"\n");
		Transaction trans = TransactionManager.getInstance().nuevaTransaccion();
		trans.start();
		DAOVideojuego dao = DAOFactoria.getInstancia().nuevoDaoVideojuego();
		
		if(dao.buscarIDVideojuego(transfer.getID())) {
			dao.modificarVideojuego(transfer);
			trans.commit();
		}
		else {
			trans.rollback();
			throw new commandException("ERROR: Videojuego inexistente");
		}
		TransactionManager.getInstance().eliminarTransaccion();

	}

	public TransferVideojuego mostrarVideojuego(TransferVideojuego transfer) throws commandException {
		//return transfer; //esto esta mal
		Transaction trans = TransactionManager.getInstance().nuevaTransaccion();
		trans.start();
		TransferVideojuego ret;
		DAOVideojuego dao = DAOFactoria.getInstancia().nuevoDaoVideojuego();
		if(!dao.buscarIDVideojuego(transfer.getID())) throw new commandException("ERROR: Videojuego inexistente");
		else ret= dao.mostrarVideojuego(transfer.getID());
		System.err.println(ret.getNombre());
		return ret;
	}

	public ArrayList<TransferVideojuego> mostrarTodosVideojuegos() {
		
		Transaction trans = TransactionManager.getInstance().nuevaTransaccion();
		trans.start();
		DAOVideojuego dao = DAOFactoria.getInstancia().nuevoDaoVideojuego();
	    return dao.mostrarTodosVideojuegos();
	}

	public void eliminarVideojuego(TransferVideojuego transfer) throws commandException {
		Transaction trans = TransactionManager.getInstance().nuevaTransaccion();
		trans.start();
		DAOVideojuego dao = DAOFactoria.getInstancia().nuevoDaoVideojuego();
		
		if(!dao.buscarIDVideojuego(transfer.getID())) {
			trans.rollback();
			throw new commandException("ERROR: Videojuego inexistente");
		}
		else {
			dao.eliminarVideojuego(transfer);
			trans.commit();
		}
		TransactionManager.getInstance().eliminarTransaccion();
		
	}
}