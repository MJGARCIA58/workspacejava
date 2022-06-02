package curso;

public class Profesor extends Persona {
	//Atributos
		protected int numeroDeEdadesEstudiantes;
		protected double sumaDeEdadesEstudiantes;
		protected double estudiantesEdadMedia;

		// constructor parametrizado
		public Profesor(int id, int edad, int telefono, int numeroDeEdadesEstudiantes, 
				double sumaDeEdadesEstudiantes, double estudiantesEdadMedia) {
			
			super(numeroDeEdadesEstudiantes, numeroDeEdadesEstudiantes, numeroDeEdadesEstudiantes);
			this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
			this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
			this.estudiantesEdadMedia = estudiantesEdadMedia;
		}
		
		// m�todos no est�ticos
		public void agregarEdadEstudiante(int edad) {
			System.out.println("M�todo agregarEdadEstudiante de Profesor");
		}
		
		public void mostrarInfo() {
			System.out.println("M�todo mostrarInfo de Profesor");
		}

		
			//Get y set
		public int getNumeroDeEdadesEstudiantes() {
			return numeroDeEdadesEstudiantes;
		}

		public void setNumeroDeEdadesEstudiantes(int numeroDeEdadesEstudiantes) {
			this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
		}

		public double getSumaDeEdadesEstudiantes() {
			return sumaDeEdadesEstudiantes;
		}

		public void setSumaDeEdadesEstudiantes(double sumaDeEdadesEstudiantes) {
			this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
		}

		public double getEstudiantesEdadMedia() {
			return estudiantesEdadMedia;
		}

		public void setEstudiantesEdadMedia(double estudiantesEdadMedia) {
			this.estudiantesEdadMedia = estudiantesEdadMedia;
		}
		
		
		// metodo que esta sobre escrito arriba
		@Override
		public void mostrarID() {
			System.out.println(this.id);
			
		}
			
		

}
