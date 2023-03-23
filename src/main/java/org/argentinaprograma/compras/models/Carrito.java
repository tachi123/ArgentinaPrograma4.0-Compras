package org.argentinaprograma.compras.models;

import java.util.ArrayList;
import java.util.List;

import org.argentinaprograma.compras.exceptions.SinStockException;

public class Carrito {
	
	private Persona persona;

	private List<ItemCarrito> items;
	
	public Carrito() {
		this.items = new ArrayList<ItemCarrito>();
	}
	
	public List<ItemCarrito> getItems(){
		return this.items;
	}
	
	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}
	
	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}
		
	public void imprimiEnPantallaElDueño() {
		System.out.println(this.persona.getApellido() + ", " + this.persona.getNombre());;
	}
	
	public Double costoFinal() {
		Double costoFinal = 0.0;
		for(ItemCarrito item : this.getItems()) {
			costoFinal = costoFinal + item.precio();
		}
		return costoFinal;
	}
	
	public Double costoFinal(Descuento desc) {
		Double costoFinal = 0.0;
		for(ItemCarrito item : this.getItems()) {
			costoFinal = costoFinal + item.precio();
		}
		return desc.valorFinal(costoFinal);
	}
	
	public Double costoFinalSiHayStock() throws SinStockException {
		Double costoFinal = 0.0;
		for(ItemCarrito item : this.getItems()) {
			costoFinal = costoFinal + item.getPrecioSiHayStock();
		}
		return costoFinal;
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
