package com.mxCrudAdea.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADEA")
public class Adea {
	
	
	/*
	 * 
	 *   CREATE TABLE ADEA(
ID NUMBER PRIMARY KEY,
CLIENTE NVARCHAR2(50),
APELLIDO_PATERNO NVARCHAR2(50),
APELLIDO_MATERNO NVARCHAR2(50),
EMAIL NVARCHAR2(50),
FECHAALTA DATE,
FECHABAJA DATE,
STATUS NVARCHAR2(1),
FECHAREVOCADO DATE,
FECHA_VIGENCIA DATE,
AREA NUMBER,
FECHAMODIFICACION DATE
);
	 * */
	
	@Id
	@Column(name="ID", columnDefinition = "NUMBER")
	int id;
	@Column(name="CLIENTE", columnDefinition = "NVARCHAR2(50)")
	String cliente;
	@Column(name="APELLIDO_PATERNO", columnDefinition = "NVARCHAR2(50)")
	String apellido_paterno;
	@Column(name="APELLIDO_MATERNO", columnDefinition = "NVARCHAR2(50)")
	String apellido_materno;
	@Column(name="EMAIL", columnDefinition = "NVARCHAR2(50)")
	String email;
	@Column(name="FECHAALTA", columnDefinition = "NVARCHAR2(50)")
	Date fechaalta;
	@Column(name="FECHABAJA", columnDefinition = "NVARCHAR2(50)")
	Date fechabaja;
	@Column(name="STATUS", columnDefinition = "NVARCHAR2(50)")
	String status;
	@Column(name="FECHAREVOCADO", columnDefinition = "NVARCHAR2(50)")
	Date fecha_revocado;
	@Column(name="FECHA_VIGENCIA", columnDefinition = "NVARCHAR2(50)")
	Date fecha_vigencia;
	@Column(name="AREA", columnDefinition = "NUMBER")
	String area;
	@Column(name="FECHAMODIFICACION", columnDefinition = "NVARCHAR2(50)")
	Date fechamodifucacion;
	
	public Adea() {
		
	}

	public Adea(int id) {
		
		this.id = id;
	}

	public Adea(int id, String cliente, String apellido_paterno, String apellido_materno, String email, Date fechaalta,
			Date fechabaja, String status, Date fecha_revocado, Date fecha_vigencia, String area,
			Date fechamodifucacion) {
		this.id = id;
		this.cliente = cliente;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.email = email;
		this.fechaalta = fechaalta;
		this.fechabaja = fechabaja;
		this.status = status;
		this.fecha_revocado = fecha_revocado;
		this.fecha_vigencia = fecha_vigencia;
		this.area = area;
		this.fechamodifucacion = fechamodifucacion;
	}

	@Override
	public String toString() {
		return "Adea [id=" + id + ", cliente=" + cliente + ", apellido_paterno=" + apellido_paterno
				+ ", apellido_materno=" + apellido_materno + ", email=" + email + ", fechaalta=" + fechaalta
				+ ", fechabaja=" + fechabaja + ", status=" + status + ", fecha_revocado=" + fecha_revocado
				+ ", fecha_vigencia=" + fecha_vigencia + ", area=" + area + ", fechamodifucacion=" + fechamodifucacion
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

	public Date getFechabaja() {
		return fechabaja;
	}

	public void setFechabaja(Date fechabaja) {
		this.fechabaja = fechabaja;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFecha_revocado() {
		return fecha_revocado;
	}

	public void setFecha_revocado(Date fecha_revocado) {
		this.fecha_revocado = fecha_revocado;
	}

	public Date getFecha_vigencia() {
		return fecha_vigencia;
	}

	public void setFecha_vigencia(Date fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getFechamodifucacion() {
		return fechamodifucacion;
	}

	public void setFechamodifucacion(Date fechamodifucacion) {
		this.fechamodifucacion = fechamodifucacion;
	}

	
}
