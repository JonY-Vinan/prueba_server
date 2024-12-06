package pruebaServidor.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pruebaServidor.entidad.Cliente;
import pruebaServidor.entidad.TipoUsuario;
import pruebaServidor.entidad.UserPrivilege;
import pruebaServidor.entidad.UserStatus;

public class DaoClienteSqlite implements DaoCliente {

	private static final String SQL_SELECT = "SELECT * FROM clientes";
	//private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id=?";
	//private static final String SQL_SELECT_NOMBRE = SQL_SELECT + " WHERE nombre LIKE ?";
	// private static final String SQL_SELECT_PRECIO = SQL_SELECT + " WHERE precio
	// BETWEEN ? AND ?";
	// private static final String SQL_INSERT = "INSERT INTO productos (nombre,
	// precio, fecha_caducidad) VALUES (?,?,?)";
	// private static final String SQL_UPDATE = "UPDATE productos SET nombre=?,
	// precio=?, fecha_caducidad=? WHERE id=?";
	// private static final String SQL_DELETE = "DELETE FROM productos WHERE id=?";

	private String url;
	private String user;
	private String pass;

	public DaoClienteSqlite(String url, String user, String pass) {
		this.url = url;
		this.user = user;
		this.pass = pass;
	}

	private Connection getConexion() {
		try {
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			throw new AccesoDatosException("No se ha podido conectar con la base de datos", e);
		}
	}

	@Override
	public Iterable<Cliente> obtenerTodos() {
		try (Connection con = getConexion();
				PreparedStatement pst = con.prepareStatement(SQL_SELECT);
				ResultSet rs = pst.executeQuery()) {
			var clientes = new ArrayList<Cliente>();

			while (rs.next()) {
				var id = rs.getLong("idCliente");
				var login = rs.getString("login");
				var email = rs.getString("email");
				var fullName = rs.getString("Nombre");
				var status = rs.getInt("estado");
				var privilege = rs.getInt("privilegio");
				var tipoUsuario = rs.getInt("tipo");
				var password = rs.getString("Contraseña");
				var telefono = rs.getInt("telefono: ");

				var fechaConection = rs.getDate("fechaConeccion");
				var fConection = fechaConection != null ? fechaConection.toLocalDate() : null;

				var fechaPassChange = rs.getDate("ultimaContraseña");
				var fPass = fechaPassChange != null ? fechaPassChange.toLocalDate() : null;

				var fechaAlta = rs.getDate("fechaAlta");
				var fAlta = fechaAlta != null ? fechaAlta.toLocalDate() : null;

				var estado = UserStatus.fromInt(status);
				var privilegio = UserPrivilege.fromInt(privilege);
				var tipo = TipoUsuario.fromInt(tipoUsuario);

				var cliente = new Cliente(id, login, email, fullName, estado, privilegio, tipo, password, fConection,
						fPass, telefono, fAlta);
				clientes.add(cliente);
			}

			return clientes;
		} catch (SQLException e) {
			throw new AccesoDatosException("Error en la consulta", e);
		}
	}

	@Override
	public Cliente obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente insertar(Cliente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente modificar(Cliente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<Cliente> onbtenerClientePorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
