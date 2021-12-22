package automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		return vehiculo.debeRealizarVtv(fecha);

	}
	
	/*
	 * El bad smell es el feature envy
	 */
}
