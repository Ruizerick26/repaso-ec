package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Item;

public class Testitem {
	public static void main(String[] args) {
		Item it1 = new Item("Mouse");
		it1.setProductosActuales(20);
		it1.imprimir();
		System.out.println("------------------");
		it1.vender(5);
		it1.devolver(2);
		it1.imprimir();
		System.out.println("------------------");
		Item it2 = new Item("Parlante");
		it2.setProductosActuales(15);
		it2.imprimir();
		System.out.println("------------------");
		it2.vender(7);
		it2.devolver(5);
		it2.imprimir();
		System.out.println("------------------");
	}
}
