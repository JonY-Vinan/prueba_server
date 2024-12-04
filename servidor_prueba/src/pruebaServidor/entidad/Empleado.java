package pruebaServidor.entidad;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Empleado {
	
	private LocalDate fechaAlta;
	private BigDecimal salario;
	private TipoEmpleado tipoEmpleado;
	public Empleado() {
		super();
	}
	public Empleado(LocalDate fechaAlta, BigDecimal salario, TipoEmpleado tipoEmpleado) {
		super();
		this.fechaAlta = fechaAlta;
		this.salario = salario;
		this.tipoEmpleado = tipoEmpleado;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fechaAlta, salario, tipoEmpleado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(fechaAlta, other.fechaAlta) && Objects.equals(salario, other.salario)
				&& tipoEmpleado == other.tipoEmpleado;
	}
	@Override
	public String toString() {
		return "Empleado [fechaAlta=" + fechaAlta + ", salario=" + salario + ", tipoEmpleado=" + tipoEmpleado + "]";
	}

	
}
