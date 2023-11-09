package com.curso.proyecto1;

/**
 * La clase Jugador representa a un jugador dentro de un equipo. Hereda de la
 * clase Equipo, proporcionando información sobre el nombre del jugador, su
 * número y el nombre del equipo al que pertenece.
 */
public class Jugador extends Equipo {

	protected String nombrejugador;
	protected int numero;

	/**
	 * Constructor que crea una instancia de la clase Jugador con nombre de equipo,
	 * nombre de jugador y número.
	 *
	 * @param nombreEquipo  El nombre del equipo al que pertenece el jugador.
	 * @param nombrejugador El nombre del jugador.
	 * @param numero        El número del jugador.
	 */
	protected Jugador(String nombreEquipo, String nombrejugador, int numero) {
		super(nombreEquipo);
		this.nombrejugador = nombrejugador;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Jugador [NOMBRE = " + nombrejugador + ", NUMERO = " + numero + ", EQUIPO = " + nombreEquipo
				+ ", LIGA = " + nombreliga + "]";
	}

}
