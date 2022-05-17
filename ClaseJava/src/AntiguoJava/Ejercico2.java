package AntiguoJava;
import java.util.Scanner;

public class Ejercico2 {

	public static void main(String[] args) {

		/*
		 * Pedir por teclado un numero al usuario si es mayor que 5, mostrar un 0 y si
		 * es menor que 5, mostrar un 1. Utilizar el operador ternario
		 * 
		 */

		Scanner keyboard = new Scanner(System.in);

		// introducir la primera nota
		System.out.print("Introducir un número mayor que 5 : ");
		int numero = keyboard.nextInt();
		
//		int n6 = (CONDICION) ? VALOR_SI_CUMPLE : VALOR_SI_NO_CUMPLE;
		int numero2 = (numero >=5) ? 0 : 1;
		System.out.println(numero2);
		
		keyboard.close();

	}

}
