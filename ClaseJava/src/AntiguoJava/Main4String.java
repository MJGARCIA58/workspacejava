package AntiguoJava;
public class Main4String {

	public static void main(String[] args) {
		
		String texto = " Esto es un string";
		
		// la longitud del string
		System.out.println(texto.length());
		
		// mostrar el elemento de la posici�n 5
		System.out.println(texto.charAt(5));
		
		// buscar un string dentro de otro string
		int posicion = texto.indexOf("es");
		System.out.println(posicion);
		
		//comparar dos strings 
		String str1 = "hola";
		String str2 = "hola";
		
		//str1 == str2 // equals devuelve un boolean
		if(str1.equals(str2)) {
		System.out.println("Son iguales");
		}
		
		//itera un string 
		for (int i=0; i<texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
		
		// inmutabilidad -> no se puede cambiar el contenido de un string
		String texto2 = "hola";
		texto2 = "adios";
		//texto2 = texto2 + "hola";
		texto2 += "hola";
		
		String numeros = "";
		
		long tiempoInicial = System.currentTimeMillis();
		for (int i = 0; i < args.length; i++) {
			numeros += i;
		}
		
		long tiempoFinal = System.currentTimeMillis();

		long diff = tiempoFinal - tiempoInicial;
		System.out.println(diff);
		
		System.out.println(numeros);
		
		
		
		
		
		
		

	}

}


		
		
	
	
	
	
	
	
	
	
	


