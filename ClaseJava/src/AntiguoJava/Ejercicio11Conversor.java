package AntiguoJava;
import java.util.Scanner;

public class Ejercicio11Conversor {

	public static double convertirKmAUA(long km) {
		double ua = km / 150000000.0;
		return ua;
	}

	public static void main(String[] args) {

		/*
		 * Convertir de Unidad Astron�mica (UA) a km. Escribir un m�todo
		 * (convertirKmAUA) que reciba los km en long y devuelva el n�mero de UA en int
		 */

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduzca km: ");
		long km = keyboard.nextLong();

		double ua = Ejercicio11Conversor.convertirKmAUA(km);
		System.out.println(ua + " UA");
		
		
		/*
		 * Convertir de Euros a peseta. Escribir un m�todo (convertirEurosAPeseta) que 
		 * reciba los euros en double y devuelva el n�mero de pesetas en long
		 */
		
		System.out.print("Introduzca euros: ");
		double euros = keyboard.nextDouble();
		double pesetas = Ejercicio11Conversor.convertirEurosAPeseta(euros);
		System.out.println(pesetas + " pesetas");
	}
	
	public static double convertirEurosAPeseta(double euros) {
		double pesetas = euros * 166.386;
		return pesetas;
	}
		

	}


