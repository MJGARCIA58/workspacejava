package AntiguoJava;

public class Ejercicio10String {

	public static void main(String[] args) {

		/*
		 * Ejercicio: escribe un programa que devuelva si un String es pal�ndromo (se
		 * escribe igual hacia delante y hacia detr�s). Ejemplo: "sometemos".
		 */

//		String str = "abba";

		String str = "sometemos";

//		System.out.println(str.charAt(3));

//		for(int i=0; i<str.length(); i++) {
//			System.out.println(str.charAt(i));		
//		}

		String palabraRevertida = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			palabraRevertida += str.charAt(i);
			}
		
//		System.out.println(str);
//		System.out.println(palabraRevertida);
		
		if(str.equals(palabraRevertida)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("NO es palindromo");
		}

	}

}
