package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Miembro {

	private int id;
	private String codigo;
	private String nombre;
}