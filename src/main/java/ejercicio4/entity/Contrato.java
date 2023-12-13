package ejercicio4.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CONTRATO")
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String nombreCliente;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private double importe;

	public Contrato() {
		super();
	
	}
	
	public Contrato(long id, String nombreCliente, Date fechaInicio, Date fechaFin, double importe) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.importe = importe;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	

}
