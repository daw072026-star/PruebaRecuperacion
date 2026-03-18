/**
 * @version 1.0
 * @author daw107
 * 
 */
public class Aparcamiento {
	/**
	 * 
	 * @param tipoVehiculo este es el tipo de vehiculo que puede ser moto o coche
	 * @param horas, las horas que alquilas el cehiculo
	 * @param plazasDisponibles, estas son las plazas que quedan para que ouedas aparcar en el parking
	 * @return devuelve si el acceso esta permitido o no, y el precio que cuesta
	 */

	public static String gestionarAcceso(String tipoVehiculo, int horas, int plazasDisponibles) {

		if (!tipoVehiculo.equals("coche") && !tipoVehiculo.equals("moto")) {
			return "Tipo de vehículo no permitido";
		}

		if (plazasDisponibles < 0) {
			return "Error en el número de plazas disponibles";
		}

		if (horas <= 0) {
			return "Número de horas no válido";
		}

		int precio;

		if (tipoVehiculo.equals("coche")) {
			precio = horas * 2;
		} else { // moto
			precio = horas * 1;
		}

		return "Acceso permitido. Precio total: " + precio + "€";
	}
}