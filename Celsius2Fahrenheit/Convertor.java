/**
 * 
 */
package Celsius2Fahrenheit;

import java.util.Scanner;

/**
 * @author r.mluengo
 *
 */
public class Convertor {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor en Celsius: ");
        double c = sc.nextDouble();
        double f = ((9 * c) / 5) + 32;
		System.out.println("eso son " + f + " Fahrenheit");

	}

}
