package Integracion.query.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Integracion.query.Query;
import Integracion.transactionManager.TransactionManager;
import Negocio.usuario.TransferUsuario;

public class queryDesarrollador implements Query {

	@Override
	public Object execute(Object param) {
		ArrayList<TransferUsuario> ret = new ArrayList<TransferUsuario>();
		TransferUsuario transfer = new TransferUsuario();
		ResultSet rs;
		Statement s;
		String query = "SELECT * FROM desarrollador WHERE descuento = " + String.valueOf(param) + ";";
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			while(rs.next()) {
				transfer.setID(Integer.valueOf(rs.getString("ID")));
				transfer.setApellidos(rs.getString("Apellidos"));
				transfer.setNombre(rs.getString("Nombre"));
				transfer.setEmail(rs.getString("Email"));
				transfer.setNick(rs.getString("Nick"));
				//((Object) transfer).setDescuento(rs.getString("Descuento"));
				ret.add(transfer);
			}
			s.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
		
	}

}
