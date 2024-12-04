package pruebaServidor.app;

import java.time.LocalDate;
import java.util.ArrayList;

import pruebaServidor.accesodatos.DaoCliente;
import pruebaServidor.biblioteca.Util;
import pruebaServidor.entidad.*;
import pruebaServidor.factoria.GestionFactoria;

public class Aplicacion {
	private static final int SALIR = 0;
	private static final DaoCliente DAO = GestionFactoria.getDaoCliente();
	private static final boolean CON_ID = true;
	private static final boolean SIN_ID = false;

	public static void main(String[] args) {

		int opc = 0;

		do {
			opc = menu();
			switch (opc) {
			case 1:
				nuevoCliente();
				break;
			case 2:
				listarUsuario();
				break;
			case 3:
				buscarUsuarioPorId();
				break;
			case 4:
				buscarUsuarioPorNombre();
				break;
			case 5:
				modificarUsuario();
				break;
			case 6:
				borrarUsuario();
				break;

			default:
				break;
			}
		} while (opc != SALIR);

	}

	private static void nuevoCliente() {
		var cliente = anadirCliente(SIN_ID);
	}

	private static Cliente anadirCliente(boolean conId) {
		Long id = null;
		if (conId) {
			id = (long) Util.leerInt("Id: ");
		}

		var login = Util.leerCadena("login");
		var email = Util.leerCadena("email");
		var fullName = Util.leerCadena("Nombre");
		var status = UserStatus.ENABLED;
		var privilege = UserPrivilege.USER;
		var tipoUsuario = TipoUsuario.CLIENTE;
		var password = Util.leerCadena("Contraseña");
		var telefono = Util.leerInt("Telefono: ");

		Cliente cliente = (Cliente) new Usuario(id, login, email, fullName, status, privilege,
				tipoUsuario, password, null, null, telefono);
		return cliente;
	}

	private static void listarUsuario() {
		// TODO Auto-generated method stub

	}

	private static void buscarUsuarioPorId() {
		// TODO Auto-generated method stub

	}

	private static void buscarUsuarioPorNombre() {
		// TODO Auto-generated method stub

	}

	private static void modificarUsuario() {
		// TODO Auto-generated method stub

	}

	private static void borrarUsuario() {
		// TODO Auto-generated method stub

	}

	private static int menu() {
		int respuesta = 0;
		respuesta = Util.leerInt("""
				 ** M E N U **
				 1.-Nuevo usuario
				 2.-listados de los usuarios
				 3.-buscar usuario por id
				 4.-buscar usuario por nombre
				 5.-modificar usuario
				 6.-borrar usuario
				 0.-Salir
				 Elige una opcion:
				""");
		return respuesta;
	}
}
