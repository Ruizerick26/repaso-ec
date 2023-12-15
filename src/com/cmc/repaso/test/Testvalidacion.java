package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Validacion;
public class Testvalidacion {
	public static void main(String[] args) {
		Validacion monto1 = new Validacion();
		boolean respuesta = monto1.validarMonto(20);
		System.out.println("La validacion es : " + respuesta );
	}
}
