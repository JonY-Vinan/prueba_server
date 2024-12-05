package pruebaServidor.entidad;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Cliente extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6545654277525712658L;
	private int telefono;
	private LocalDate fechaAlta;


	public Cliente(Long idUsuario, String login, String email, String fullName, UserStatus status,
			UserPrivilege privilege, TipoUsuario tipoUsuario, String password, LocalDate lastAccess, LocalDate lastPasswordChange,
			int telefono, LocalDate fechaAlta) {
		super(idUsuario, login, email, fullName, status, privilege, tipoUsuario, password, lastAccess,
				lastPasswordChange);
		this.telefono = telefono;
		this.fechaAlta = fechaAlta;
	}

	public Cliente(int telefono, LocalDate fechaAlta) {
		super();
		this.telefono = telefono;
		this.fechaAlta = fechaAlta;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaAlta, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(fechaAlta, other.fechaAlta) && telefono == other.telefono;
	}

	@Override
	public String toString() {
		return "Cliente [telefono=" + telefono + ", fechaAlta=" + fechaAlta + "]";
	}

}
