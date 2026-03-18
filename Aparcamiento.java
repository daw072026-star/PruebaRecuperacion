public class Aparcamiento {

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