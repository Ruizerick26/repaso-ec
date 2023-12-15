package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Estudiante;
public class Testcalificar {
	public static void main(String[] args) {
		Estudiante Est1 = new Estudiante("Alfonso");
		Est1.calificar(9);
		System.out.println("estudiante: "+Est1.getNombre() + "\nNota: " + Est1.getNota() + 
				"\nValidación: " + Est1.getResultado());
	}
}
