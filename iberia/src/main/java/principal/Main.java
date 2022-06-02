package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Iberia().insertarDatos();
		
		Iberia iberia = new Iberia();
		
		iberia.vaciarBaseDeDatos();
		iberia.insertarDatos();

	}

}
