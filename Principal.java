package com.curso.proyecto1;

/**
 * La clase Principal contiene el método main que sirve para la ejecución del
 * programa. Aquí se crean instancias de las clases Equipo y Jugador para
 * demostrar su funcionamiento.
 */

public class Principal {

	public static void main(String[] args) {

		Equipo miami = new Equipo("Miami Heat", "Este");
		Equipo lakers = new Equipo("Los Angeles Lakers", "Oeste");
		System.out.println(miami);
		System.out.println(lakers);

		System.out.println(miami.conferenciaOeste());

		Jugador butler = new Jugador(miami.nombreEquipo, "Jimmy Butler", 21);
		System.out.println(butler);

	}

}
