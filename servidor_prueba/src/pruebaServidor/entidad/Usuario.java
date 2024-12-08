package pruebaServidor.entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import pruebaServidor.biblioteca.Util;

/**
 * Clase que define los atributos y los métodos de la entidad "Usuario".
 *
 * @author prueba
 */

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Id del usuario. Es la clave primaria de la tabla "usuario".
	 */
	private Long idUsuario;
	/**
	 * Login del usuario.
	 */
	private String login;
	/**
	 * Email del usuario.
	 */
	private String email;
	/**
	 * Nombre completo del usuario.
	 */
	private String fullName;
	/**
	 * Estado del usuario, que puede ser ENABLED o DISABLED.
	 */
	private UserStatus status;
	/**
	 * Privilegio del usuario, que puede ser ADMIN o USER.
	 */
	private UserPrivilege privilege;
	/**
	 * Tipo de usuario, que puede ser BIBLIOTECARIO, PROFESOR o ALUMNO.
	 */

	private TipoUsuario tipoUsuario;
	/**
	 * Contraseña del usuario.
	 */
	private String password;
	/**
	 * Fecha del último acceso del usuario.
	 */
	private LocalDate lastAccess;
	/**
	 * Fecha de la última vez en la que se ha modificado la contraseña del usuario.
	 */
	private LocalDate lastPasswordChange;

	/**
	 * Constructor vacio de Usuario
	 */
	public Usuario() {
		super();
	}

	/**
	 * Constructor de usuario con todos sus atributos
	 * 
	 * @param idUsuario
	 * @param login
	 * @param email
	 * @param fullName
	 * @param status
	 * @param privilege
	 * @param tipoUsuario
	 * @param password
	 * @param lastAccess
	 * @param lastPasswordChange
	 */
	public Usuario(Long idUsuario, String login, String email, String fullName, UserStatus status,
			UserPrivilege privilege, TipoUsuario tipoUsuario, String password, LocalDate lastAccess,
			LocalDate lastPasswordChange) {

		this.idUsuario = idUsuario;
		this.login = login;
		this.email = email;
		this.fullName = fullName;
		this.status = status;
		this.privilege = privilege;
		this.tipoUsuario = tipoUsuario;
		this.password = password;
		this.lastAccess = lastAccess;
		this.lastPasswordChange = lastPasswordChange;
	}

	/**
	 * Método que obtiene el id del usuario.
	 *
	 * @return el id que se va a mostrar.
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Método que establece el id del usuario.
	 *
	 * @param idUsuario el id que se va a guardar.
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * Método que obtiene el login del usuario.
	 *
	 * @return el login que se va a mostrar.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Método que establece el login del usuario.
	 *
	 * @param login el login que se va a guardar.
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Método que obtiene el email del usuario.
	 *
	 * @return el email que se va a mostrar.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método que establece el email del usuario.
	 *
	 * @param email el email que se va a guardar.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método que obtiene el nombre completo del usuario.
	 *
	 * @return el nombre completo que se va a mostrar.
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Método que establece el nombre completo del usuario.
	 *
	 * @param fullName el nombre completo que se va a guardar.
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Método que obtiene el estado del usuario.
	 *
	 * @return el estado que se va a mostrar.
	 */
	public UserStatus getStatus() {
		return status;
	}

	/**
	 * Método que establece el estado del usuario.
	 *
	 * @param status el estado que se va a guardar.
	 */
	public void setStatus(UserStatus status) {
		this.status = status;
	}

	/**
	 * Método que obtiene el privilegio del usuario.
	 *
	 * @return el privilegio que se va a mostrar.
	 */
	public UserPrivilege getPrivilege() {
		return privilege;
	}

	/**
	 * Método que establece el privilegio del usuario.
	 *
	 * @param privilege el privilegio que se va a guardar.
	 */
	public void setPrivilege(UserPrivilege privilege) {
		this.privilege = privilege;
	}

	/**
	 * Método que obtiene el tipo de usuario.
	 *
	 * @return el tipo de usuario que se va a mostrar.
	 */
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Método que establece el tipo de usuario.
	 *
	 * @param tipoUsuario el tipo de usuario que se va a guardar.
	 */
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * Método que obtiene la contraseña del usuario.
	 *
	 * @return la contraseña que se va a mostrar.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Método que establece la contraseña del usuario.
	 *
	 * @param password la contraseña que se va a guardar.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Método que obtiene el último acceso del usuario.
	 *
	 * @return el último acceso que se va a mostrar.
	 */
	public LocalDate getLastAccess() {
		return lastAccess;
	}

	/**
	 * Método que establece el último acceso del usuario.
	 *
	 * @param lastAccess el último acceso que se va a guardar.
	 */
	public void setLastAccess(LocalDate lastAccess) {
		this.lastAccess = lastAccess;
	}

	/**
	 * Método que obtiene el último cambio de contraseña del usuario.
	 *
	 * @return la fecha del último cambio de contraseña que se va a mostrar.
	 */
	public LocalDate getLastPasswordChange() {
		return lastPasswordChange;
	}

	/**
	 * Método que establece el último cambio de contraseña del usuario.
	 *
	 * @param lastPasswordChange la fecha del último cambio de contraseña que se va
	 *                           a guardar.
	 */
	public void setLastPasswordChange(LocalDate lastPasswordChange) {
		this.lastPasswordChange = lastPasswordChange;
	}

	/**
	 * Método que compara el código hash de dos objetos.
	 *
	 * @return el código hash del objeto.
	 */
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 23 * hash + Objects.hashCode(this.idUsuario);
		hash = 23 * hash + Objects.hashCode(this.login);
		hash = 23 * hash + Objects.hashCode(this.email);
		hash = 23 * hash + Objects.hashCode(this.fullName);
		hash = 23 * hash + Objects.hashCode(this.status);
		hash = 23 * hash + Objects.hashCode(this.privilege);
		hash = 23 * hash + Objects.hashCode(this.tipoUsuario);
		hash = 23 * hash + Objects.hashCode(this.password);
		hash = 23 * hash + Objects.hashCode(this.lastAccess);
		hash = 23 * hash + Objects.hashCode(this.lastPasswordChange);
		return hash;
	}

	/**
	 * Método que compara si un objeto es igual al objeto "Usuario".
	 *
	 * @param obj cualquier tipo de objeto.
	 * @return un "false" si los objetos noson iguales y un "true" si lo son.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Usuario other = (Usuario) obj;
		if (!Objects.equals(this.login, other.login)) {
			return false;
		}
		if (!Objects.equals(this.email, other.email)) {
			return false;
		}
		if (!Objects.equals(this.fullName, other.fullName)) {
			return false;
		}
		if (!Objects.equals(this.password, other.password)) {
			return false;
		}
		if (!Objects.equals(this.idUsuario, other.idUsuario)) {
			return false;
		}
		if (this.status != other.status) {
			return false;
		}
		if (this.privilege != other.privilege) {
			return false;
		}
		if (this.tipoUsuario != other.tipoUsuario) {
			return false;
		}
		if (!Objects.equals(this.lastAccess, other.lastAccess)) {
			return false;
		}
		if (!Objects.equals(this.lastPasswordChange, other.lastPasswordChange)) {
			return false;
		}
		return true;
	}

	/**
	 * Método que devuelve un String con los atributos del usuario.
	 *
	 * @return un String con los atributos de la entidad.
	 */
	@Override
	public String toString() {
		return "Usuario" + "ID: " + idUsuario + "login: " + login + " email: " + email + " Name: " + fullName
				+ " status: " + status + " privilege: " + privilege + " tipoUsuario: " + tipoUsuario + "password: "
				+ password + " lastAccess: " + lastAccess + " lastPasswordChange: " + lastPasswordChange;

	}

	public void setDatos() {
		idUsuario = (long) Util.leerInt("Id: ");
		login = Util.leerCadena("login: ");
		email = Util.leerCadena("email: ");
		fullName = Util.leerCadena("nombre: ");
		status = UserStatus.ENABLED;
		privilege = UserPrivilege.USER;
		tipoUsuario = TipoUsuario.CLIENTE;
		password = Util.leerCadena("contraseña: ");
		;
	}
}