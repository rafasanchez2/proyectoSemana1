package com.curso.proyecto1;

/**
 * La interfaz Conferencia define métodos para verificar la pertenencia de uuna
 * clase a la conferencia este o a la oeste.
 */

public interface Conferencia {

	/**
	 * Comprueba si la entidad pertenece a la conferencia Este.
	 *
	 * @return true si la entidad pertenece a la conferencia Este, false de lo
	 *         contrario.
	 */

	public boolean conferenciaEste();

	/**
	 * 
	 * Comprueba si la entidad pertenece a la conferencia Oeste.
	 *
	 * @return true si la entidad pertenece a la conferencia Oeste, false de lo
	 *         contrario.
	 */

	public boolean conferenciaOeste();

}
