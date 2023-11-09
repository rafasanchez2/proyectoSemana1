package com.curso.proyecto1;

/**
 * La clase Equipo representa un equipo. Hereda de la clase abstracta Liga e
 * implementa la interfaz Conferencia, proporcionando información sobre el
 * nombre del equipo, su conferencia y su afiliación a la liga.
 */

public class Equipo extends Liga implements Conferencia {

	protected String nombreEquipo;
	protected String conferencia;

	/**
	 * Constructor que crea una instancia de la clase Equipo con nombre y
	 * conferencia.
	 *
	 * @param nombreEquipo El nombre del equipo.
	 * @param conferencia  La conferencia a la que pertenece el equipo.
	 */

	protected Equipo(String nombreEquipo, String conferencia) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.conferencia = conferencia;

	}

	/**
	 * Constructor que crea una instancia de la clase {@code Equipo} solo con
	 * nombre.
	 *
	 * @param nombreEquipo El nombre del equipo.
	 */

	protected Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;

	}

	@Override
	public String toString() {
		return "Equipo [NOMBRE = " + nombreEquipo + ", CONFERENCIA = " + conferencia + ", LIGA = " + nombreliga + "]";
	}

	@Override
	public boolean conferenciaEste() {
		if (conferencia.equals("Oeste")) {
			System.out.println("No pertenece a la conferencia ESTE");

			return false;
		}
		System.out.println("Pertenece a la conferencia ESTE");

		return true;
	}

	@Override
	public boolean conferenciaOeste() {
		if (conferencia.equals("Este")) {
			System.out.println("No pertenece a la conferencia OESTE");
			return false;
		}
		System.out.println("Pertenece a la conferencia OESTE");
		return true;
	}

}
