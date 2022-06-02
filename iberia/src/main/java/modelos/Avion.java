package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Avion {

	private int id;
	private String codigo;
	private String tipo;
	private int id_base;
	private int id_vuelo;
}

