import java.time.LocalDate;

public class ProgamaAgenda {
	
	public static void main(String [] args) {
		
		Agenda agenda = new Agenda();
		agenda.leerEnDisco();
		System.out.println(agenda);
		
		//probamos el método agregar contacto
//		Contacto contacto1 = new Contacto("Irene", 666555444);
//		Contacto contacto2 = new Contacto("Maria Jose", 666555443);
//		
//		System.out.println(agenda.agregarContacto(contacto1));
//		System.out.println(agenda.agregarContacto(contacto1));
//		System.out.println(agenda.agregarContacto(contacto2));
		
		// probamos el método eliminarContacto
//		Contacto contacto1 = new Contacto("Irene", 666555444);
//		agenda.agregarContacto(contacto1);
//		System.out.println(agenda.eliminarContacto("Juan")); //false
//		System.out.println(agenda.eliminarContacto("Irene")); // true
//		System.out.println(agenda.eliminarContacto("Maria")); // false
	
		// probamos el método listarContactos
//				agenda.agregarContacto(new Contacto("Ana", 666555441));
//				agenda.agregarContacto(new Contacto("Pedro", 666555442));
//				agenda.agregarContacto(new Contacto("Juan", 666555443));
//				agenda.agregarContacto(new Contacto("Enrique", 666555444));
//				agenda.listarContactos();	
				
				
				
				// probamos el método buscarContactos
				
				
//				LocalDate ld = LocalDate.of(1980, 5, 23);
//				agenda.agregarContacto(new ContactoPersona("Ana", 666555441, ld.toString()));
//				agenda.agregarContacto(new ContactoPersona("Pedro", 666555442, ld.toString()));
//				agenda.agregarContacto(new ContactoEmpresa("Ontech", 666555443, "http://www.ontech.es"));
//				agenda.agregarContacto(new ContactoEmpresa("CoreNetwork", 666555444, "http://www.corenetwork.es"));
//				System.out.println(agenda.buscarContacto("Ana"));  // Contacto [nombre=Ana, telefono=666555441]
//				System.out.println(agenda.buscarContacto("Chema")); // null
				
				agenda.listarContactos();
				
				
	}
	


}
