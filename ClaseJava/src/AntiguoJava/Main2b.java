package AntiguoJava;

public class Main2b {
	//ESTO ES UN METODO
	public static int suma(int numero1, int numero2) { 
		int resultado = numero1 + numero2;
		return resultado;
		
	}
	public static void main(String[] args) {
		
		int numero3 = Main2b.suma(5, 8); // creamos una variable numero 3 y despues invocamos la funcion
//		Main2b.suma(5, 8);  // El metodo de invocacion es poniendo el nombre del archivo. al nombre de la funcion  que en este caso es suma, despues
//		ponemos los valores de la variable suma
		System.out.println(numero3);

	}

}
