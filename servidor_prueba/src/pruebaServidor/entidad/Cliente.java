package pruebaServidor.entidad;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Usuario{

	private int telefono;
	private LocalDate fechaAlta;

	public Cliente() {

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
