package pruebaServidor.accesodatos;

import pruebaServidor.entidad.Cliente;

public interface DaoCliente extends Dao<Cliente>{

	Iterable<Cliente>onbtenerClientePorNombre(String nombre);
	
}
