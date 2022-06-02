package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Piloto {

	private int id;
	private String codigo;
	private String nombre;
	private int horas_de_vuelo;
}
