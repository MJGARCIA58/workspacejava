package modelos;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Vuelo {

	private int id;
	private String origen;
	private String destino;
	private LocalTime hora;
	private String numero_vuelo;
	private int id_piloto;
}
