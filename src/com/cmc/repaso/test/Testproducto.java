package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;

public class Testproducto {
	public static void main(String[] args) {
		Producto pr1 = new Producto("Leche",0.05);
		pr1.setPrecio(-0.85);
		double TPrecio = pr1.calcularPrecioPromo(0.5);
		System.out.println("Producto: " + pr1.getNombre() + "\nPrecio: " + TPrecio);
	}
}
