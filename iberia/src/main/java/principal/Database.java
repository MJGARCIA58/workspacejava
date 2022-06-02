package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelos.Avion;
import modelos.Base;
import modelos.Miembro;
import modelos.Piloto;

public class Database {

	private Connection conexion = null;
	private Session session = null;
	
	public Database() {
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/iberia", "iberia", "iberia");
			
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Base.class)
					.buildSessionFactory();
			
			// creación de un objeto de tipo Session a partir del SessionFactory
			session = factory.getCurrentSession();			
			
						
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public void insertarAvion(Avion avion) {
		
		try {
			Statement instruccion = conexion.createStatement();

			String sql = String.format("INSERT INTO avion (tipo, codigo) " + 
					"VALUES ('%s','%s')",
					avion.getTipo(), avion.getCodigo());

			int registrosInsertados = instruccion.executeUpdate(sql);
			if (registrosInsertados == 1) {
				System.out.println("Avión insertado correctamente");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarPiloto(Piloto piloto) {
		
		try {
			Statement instruccion = conexion.createStatement();

			String sql = String.format("INSERT INTO piloto (codigo, nombre, horas_de_vuelo) " + 
					"VALUES ('%s', '%s', %d)",
					piloto.getCodigo(), piloto.getNombre(), piloto.getHoras_de_vuelo());

			int registrosInsertados = instruccion.executeUpdate(sql);
			if (registrosInsertados == 1) {
				System.out.println("Piloto insertado correctamente");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarMiembro(Miembro miembro) {
		
		try {
			Statement instruccion = conexion.createStatement();

			String sql = String.format("INSERT INTO miembro (codigo, nombre) " + 
					"VALUES ('%s', '%s')",
					miembro.getCodigo(), miembro.getNombre());

			int registrosInsertados = instruccion.executeUpdate(sql);
			if (registrosInsertados == 1) {
				System.out.println("Miembro insertado correctamente");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarBase(Base base) {
		this.session.beginTransaction();
		this.session.save(base);
		this.session.getTransaction().commit();
	}

	public void vaciarTablas() {

		try {
			Statement instruccion = conexion.createStatement();
			
			// deshabilitar temporalmente la comprobación de clave foránea
			instruccion.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
		
			instruccion.executeUpdate("TRUNCATE avion");
			instruccion.executeUpdate("TRUNCATE piloto");
			instruccion.executeUpdate("TRUNCATE miembro");
			instruccion.executeUpdate("TRUNCATE vuelo");
			instruccion.executeUpdate("TRUNCATE base");
			instruccion.executeUpdate("TRUNCATE vuelo_miembro");
						
			// habilitar la comprobación de clave foránea
			instruccion.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
