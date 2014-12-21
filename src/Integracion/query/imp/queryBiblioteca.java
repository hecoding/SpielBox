package Integracion.query.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integracion.query.Query;
import Integracion.transactionManager.TransactionManager;
import Negocio.usuario.TransferUsuario;

public class queryBiblioteca implements Query{

	@Override
	public Object execute(Object param) {
		// TODO Auto-generated method stub
		ArrayList<TransferUsuario> ret = new ArrayList<TransferUsuario>();
		TransferUsuario transfer = new TransferUsuario();
		ResultSet rs;
		Statement s;
		String query = "SELECT * FROM usuario u WHERE (SELECT COUNT(*) FROM biblioteca b, videojuego v, copia c WHERE c.biblioteca = b.ID AND v.ID = c.ID) > " + param;
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			while(rs.next()) {
				transfer.setID(Integer.valueOf(rs.getString("ID")));
				transfer.setNombre(rs.getString("nombre"));
				ret.add(transfer);
			}
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// end-user-code
		return ret;
	}

}
