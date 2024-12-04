package pruebaServidor.app;

import java.util.ArrayList;

import pruebaServidor.biblioteca.Util;
import pruebaServidor.entidad.*;

public class Aplicacion {
	private static final int SALIR = 0;

	public static void main(String[] args) {

		int opc = 0;
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		do {
			opc = menu();
			switch (opc) {
			case 1:
				nuevoUsuario(usuarios);
				break;
			case 2:
				listarUsuario(usuarios);
				break;
			case 3:
				buscarUsuarioPorId(usuarios);
				break;
			case 4:
				buscarUsuarioPorNombre(usuarios);
				break;
			case 5:
				modificarUsuario(usuarios);
				break;
			case 6:
				borrarUsuario(usuarios);
				break;

			default:
				break;
			}
		} while (opc != SALIR);

	}

	private static void nuevoUsuario(ArrayList<Usuario> usuarios) {

		Usuario usuario = new Usuario();
		usuario.setDatos();
		usuarios.add(usuario);

		System.out.println("Usuasio registrado");
	}

	private static void listarUsuario(ArrayList<Usuario> usuarios) {

		for (Usuario usuario : usuarios) {
			System.out.println(usuario.toString());
		}
	}

	private static void buscarUsuarioPorId(ArrayList<Usuario> usuarios) {

		int id = Util.leerInt("Introduce id a buscar: ");
		for (Usuario usuario : usuarios) {
			if (usuario.getIdUsuario() == id) {
				System.out.println(usuario.toString());
			}
		}
	}

	private static void buscarUsuarioPorNombre(ArrayList<Usuario> usuarios) {
		String nombre = Util.leerCadena("Introduce nombre a buscar: ");
		for (Usuario usuario : usuarios) {
			if (usuario.getFullName().compareTo(nombre) == 0) {
				System.out.println(usuario.toString());
			}
		}
	}

	private static void modificarUsuario(ArrayList<Usuario> usuarios) {
		int id = Util.leerInt("Introduce id a buscar: ");
		for (Usuario usuario : usuarios) {
			if (usuario.getIdUsuario() == id) {
				System.out.println(usuario.toString());
				String login = Util.leerCadena("login: ");
				String email = Util.leerCadena("email: ");
				String fullName = Util.leerCadena("nombre: ");
				usuario.setLogin(login);
				usuario.setEmail(email);
				usuario.setFullName(fullName);
				usuarios.add(usuario);
				break;
			}
		}
	}

	private static void borrarUsuario(ArrayList<Usuario> usuarios) {
		String nombre = Util.leerCadena("Introduce nombre a buscar: ");
		for (Usuario usuario : usuarios) {
			if (usuario.getFullName().compareTo(nombre) == 0) {
				System.out.println(usuario.toString());
				int opc = Util.leerInt("Seguro que quieres borrar este usuario? 1 = SI / 2 = NO");
				if (opc == 1) {
					usuarios.remove(usuario);
				}}
		}
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
