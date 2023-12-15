package com.cmc.repaso.entidades;

public class Item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre) {
		this.nombre = nombre;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	
	public void imprimir(){
		System.out.println("Nombre Producto: "+ this.nombre +
				"\nProductos Actuales: " + this.productosActuales + 
				"\nProductos Vendidos: " + this.productosVendidos + 
				"\nProductos Devueltos: " + this.productosDevueltos);
	}
	public void vender(int vendidos){
		this.productosVendidos = this.productosVendidos + vendidos;
		this.productosActuales = this.productosActuales - vendidos;
	}
	public void devolver(int devueltos) {
		this.productosActuales = this.productosActuales + devueltos;
		this.productosVendidos = this.productosVendidos - devueltos;
		this.productosDevueltos = this.productosDevueltos + devueltos;
	}
	
	
	
}
