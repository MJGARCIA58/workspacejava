
public class Vehiculo {

	// atributos que van a heredar Coche, Avion y bicicleta
	protected float velocidad;
	protected int asientos;
	protected int orientacionRuedas;

	// metodos que van a heredar Coche, Avion y Bicicleta
	public void parar() {
		System.out.println("M�todo de parar Vehiculo");
	}

	public void acelerar() {
		System.out.println("M�todo de acelerar Vehiculo");
	}

	public void desacelerar() {
	}

	public void girarIzquierda() {
	}

	public void girarDerecha() {
	}

	// constructor de la clase vehiculo
	public Vehiculo(float velocidad, int asientos, int orientacionRuedas) {
		this.velocidad = velocidad;
		this.asientos = asientos;
		this.orientacionRuedas = orientacionRuedas;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getOrientacionRuedas() {
		return orientacionRuedas;
	}

	public void setOrientacionRuedas(int orientacionRuedas) {
		this.orientacionRuedas = orientacionRuedas;
	}

}
