package curso;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// crear un ArrayList vacío
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		//creamos el objeto de la clase estudiante
		Estudiante estudiante1 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
		//intertamos el objeto de la clase Estudiante en el ArrayList estudiantes
		estudiantes.add(estudiante1);
		// muestra por pantalla el número de elementos
		System.out.println(estudiantes.size());
		
		// acceder a un elemento por una posición y guardarlo como objeto
		Estudiante estudianteGuardado = estudiantes.get(0);
//		System.out.println(estudianteGuardado.getEdad());
		
		for (int i = 0; i < 500; i++) {
			Estudiante nuevoEstudiante = new Estudiante (i, 55, 55555, 0, 0.0, 0.0);
			estudiantes.add(nuevoEstudiante);
		}
		System.out.println(estudiantes.size());
		
		// recorro el ArrayList desde la posición inicial (0) hasta la posición final
		
//		for(int i=1; i<estudiantes.size(); i ++){
//			Estudiante nuevoEstudiante = estudiantes.get(i);
//			System.out.printf("id:%d", estudiantes.get(i).getId()).println();	
//		}
		
//		for (Estudiante estudiante : estudiantes) {
//			System.out.printf("id:%d",estudiante.getId()).println();
//		}
//		
		//insertamos 500 estudiantes dentro del ArrayList estudiantes
		for (int i=0; i<500; i++) {
			estudiantes.add(new Estudiante(i, 55, 55555, 0, 0.0, Math.random()*10));
		}
		
//		System.out.println(estudiantes.size());
//		for(int i=0; i<estudiantes.size(); i++) {
//			System.out.printf("id: " + estudiantes.get(i).getId() + " Nota media: " + 
//		estudiantes.get(i).getNotaMedia()).println();
//		}
		
		// recorrer todos los estudiantes, pero no se utiliza la variable i
		for (Estudiante estudiante : estudiantes) {
			System.out.println("id: " + estudiante.getId() + " Nota media: " + estudiante.getNotaMedia());
				
		}
				
		
		
		
//		Estudiante estudiante2 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante3 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante4 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante5= new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		
//		// invocaci�n a un m�todo no est�tico OBJETO.METODO_NO_ESTATICO
		estudiante1.mostrarInfo();
		
		// invocaci�n a un m�todo est�tico: CLASE.METODO_ESTATICO
		Estudiante.crearEstudiante();
		
		

	}

}


