
public  class Contacto {
	
	protected String nombre;
	protected int telefono;

	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
