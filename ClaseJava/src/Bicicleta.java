

public class Bicicleta extends Vehiculo {

	// atributo de la bicicleta
	private int cambios;

	// constructor
	public Bicicleta(float velocidad, int asientos, int orientacionRuedas, int cambios) {
		super(velocidad, asientos, orientacionRuedas);
		System.out.println("Constructor de la clase Bicicleta");
		this.cambios = cambios;
	}
	
	
	public void parar() {
		System.out.println("M�todo de parar Bicicleta");
	}
	
	
	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}


	
}