package Integracion.query.imp;

import Integracion.query.Query;
import Integracion.query.factoriaQuery;
import Presentacion.controlador.Eventos;


public class factoriaQueryImp extends factoriaQuery {

	@Override
	public Query getQuery(Integer id) {
		Query q = null;
		switch(id){
		case Eventos.QUERY_BIBLIOTECA:
			q = new queryBiblioteca();
			break;
		case Eventos.QUERY_DESARROLLADOR:
			q = new queryDesarrollador();
			break;
		}
		return q;
	}

}
