package org.argentinaprograma.compras.exceptions;

import org.argentinaprograma.compras.models.Producto;

public class SinStockException extends Exception{

	private final Producto producto;
	
	public SinStockException(Producto producto) {
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}	
	
}
