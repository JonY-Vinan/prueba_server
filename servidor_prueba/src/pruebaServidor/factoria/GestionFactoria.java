package pruebaServidor.factoria;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import pruebaServidor.accesodatos.DaoCliente;

public class GestionFactoria {
	private static DaoCliente daoCliente = null;

	static {
		try {
			Properties props = new Properties();
			props.load(GestionFactoria.class.getClassLoader().getResourceAsStream("config.properties"));

			var daoClienteClase = props.getProperty("dao.cliente.implementacion");

			var url = props.getProperty("dao.url");
			var user = props.getProperty("dao.user");
			var pass = props.getProperty("dao.pass");

			daoCliente = (DaoCliente) Class.forName(daoClienteClase).getConstructor(String.class, String.class, String.class).newInstance(url, user, pass);

			
		} catch (IOException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			throw new FabricaException("No se ha podido inicializar la fábrica", e);
		}
	}
}
