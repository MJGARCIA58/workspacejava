package AntiguoJava;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		// math application
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 / 2);
		System.out.println(5.0 / 2); // para dividir con decimales
		System.out.println(5 % 2);
		System.out.println(Math.pow(5, 2)); // Para poner exponencia
		System.out.println("2 * 3"); // para que salga en la consola 2*3
		System.out.println(2 * 3); // para que salga el resultado

		// Secuencias de escape
		System.out.println("Hola\nmundo"); // salto de linea \n
		System.out.println("\tHola\nmundo"); // tabulador \t
		System.out.println(" \" "); // para que salgan las comillas
		System.out.println("\"hola\" "); // para que aparezca ("hola")
		System.out.println(" \\ "); // para que aparezca una barra invertida(\)

		// printf
		System.out.printf("El producto de 5*2 = %d", 5 * 2).println(); // %d sustituye a un numero entero, y si es
																		// decimal %f (float)
		System.out.printf("5 + 6 + 7 = %d", 5 + 6 + 7).println();

		// Tipos de variable: Númericos

		// variable de tipo entero INT
		// Javascript es const edad: number = 18;
		int edad = 18; //
		System.out.println(edad);
		edad = 6; // cambiar el valor de la variable

		// variable de tipo flotante (decimal)
		double precioBarraPan = 4.3;
		System.out.println(precioBarraPan);

		// Ejercicio 1
		int a = 2;
		int b = 4;
		int c = 6;
		System.out.println(a + b + c );
		c = 8;
		System.out.printf("a + b + c = %d", a + b + c ).println();
		//
		System.out.printf("%d + %d + %d = %d", a ,b, c, a + b + c).println();
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = numero1 + numero2;
		
		short numero4 = 32767;
		short numero5 = (short) (numero4 + 1);
		System.out.println(numero5);
		
		double numero6 = 5.6;
		float numero7 = (float) numero6;
		
		// char solamente para guardar una letra y se utiliza comillas simples
		char letra = 'j';
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		// a una variable de tipo primitivo no se le puede asignar el valor de null
		//bool1 = null;
		
		
		// operador de asignación compuesta
		
		int n = 5;
		// n = n+6
		n += 6; // Le suma 6 a 5 
		n++; // incrementa 1 
		System.out.println(n);
		
		// conversión de tipos
		
		// conversión automática
		byte b1 = 9; // 8 bits (1 byte)
		long l1 = b1; // long 64 bits (8 bytes)
		
		// conversión con casting o explícita
		long l2 = 800;
		byte b2 = (byte) l2;
		System.out.println(b2);
		
		//Operador de negación
		
		boolean bool3 = true;
		boolean bool4 = !bool3;
		System.out.println(bool4);
		
		//Operador ternario
//		
		int n5 = 10;
//		int n6;
//		if (n5 == 6) {
//			n6 = 8;
//		}
//		else {
//			n6 = 10;
//		}
//		System.out.println(n6);
		
//		int n6 = (CONDICION) ? VALOR_SI_CUMPLE : VALOR_SI_NO_CUMPLE;
		
		int n6 = (n5 == 6) ? 8 : 10;
		System.out.println(n6);
		
		
		
		

	}

}