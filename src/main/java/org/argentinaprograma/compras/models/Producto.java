package org.argentinaprograma.compras.models;

import java.time.LocalDate;

public class Producto {
	
	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKg;
	private Double precio;
	private Integer stock;
	
	private static final Double minPrecio = 0.1;
	private static final Integer minStock = 10;
	
	public Producto(String nombre) {
		this.setNombre(nombre);
		this.setFechaAlta(LocalDate.now());
		this.setPrecio(minPrecio);
		this.setStock(minStock);
	}
	
	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setFechaAlta(LocalDate.now());
		this.setPrecio(minPrecio);
		this.setPrecio(precio);
		this.setStock(minStock);
	}
	
	public Producto(String nombre, String descripcion, Integer pesoKg, Double precio) {
		this.setNombre(nombre);
		this.setDescripcion(descripcion); 
		this.setPesoKg(pesoKg);
		this.setPrecio(precio);
		this.setFechaAlta(LocalDate.now());
		this.setStock(minStock);
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(Integer pesoKg) {
		this.pesoKg = pesoKg;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
