package principal;

import java.util.List;

import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import com.github.javafaker.Faker;

import modelos.Avion;
import modelos.Base;
import modelos.Miembro;
import modelos.Piloto;

public class Iberia {

	private Database database;

	public Iberia() {

		this.database = new Database();
	}

	public void insertarDatos() {
		NameGenerator generator = new NameGenerator();
		Faker faker = new Faker();
		
		List<Name> personas = generator.generateNames(100);
		
		// insertamos 100 pilotos
		for (int i = 0; i < 100; i++) {
			Piloto piloto = new Piloto(0, String.valueOf(i), generator.generateName().getFirstName(), 100);
			this.database.insertarPiloto(piloto);

			Avion avion = new Avion(0, String.valueOf(i), "Boeing", 0, 1);
			this.database.insertarAvion(avion);

			Miembro miembro = new Miembro(0, String.valueOf(i), String.valueOf(i));
			this.database.insertarMiembro(miembro);

		}

		// insertamos 10 bases
		for (int i = 0; i < 10; i++) {
			Base base = new Base(0, faker.aviation().airport());

		}

	}

	public void vaciarBaseDeDatos() {
		// TODO Auto-generated method stub
		this.database.vaciarTablas();

	}

}
