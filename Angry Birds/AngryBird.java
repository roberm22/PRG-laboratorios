
package es.upm.dit.prog.laboratorio2;

import java.util.Scanner;

public class AngryBird {

	private static final double g = 9.80665;
	
	/**
	 * @param args No se usan
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la velocidad inicial de disparo = ");
		double velocidad = sc.nextDouble();
		
		System.out.print("Introduzca el angulo de disparo = ");
		double angulo = sc.nextDouble();
		
		System.out.println("Velocidad = " + velocidad);
		angulo = Math.toRadians(angulo);
		System.out.println("Angulo = " + angulo + " rad");
		
		
		double duracionvuelo = 2 * (velocidad * Math.sin(angulo)/g);
		double alturamaxima = (velocidad * Math.sin(angulo))*(velocidad * Math.sin(angulo))/(2*g);
		double impacto = (2*(velocidad*Math.sin(angulo))*(velocidad*Math.cos(angulo)))/g;
		
		System.out.println("Duracion del vuelo es = " + duracionvuelo);
		System.out.println("La altura maxima es = " + alturamaxima);
		System.out.println("El punto de impacto es = " + impacto);

	}
}
