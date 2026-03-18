import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAparcamiento {

	@Test
	void CP1() {
		String resultadoEsperado = "Acceso permitido. Precio total: 2€";
		String resultadoObtenido = Aparcamiento.gestionarAcceso("coche", 1, 0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void CP2() {
		String resultadoEsperado = "Acceso permitido. Precio total: 1€";
		String resultadoObtenido = Aparcamiento.gestionarAcceso("moto", 1, 0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void CP3() {
		String resultadoEsperado = "Tipo de vehículo no permitido";
		String resultadoObtenido = Aparcamiento.gestionarAcceso("X", 1, 0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void CP4() {
		String resultadoEsperado = "Número de horas no válido";
		String resultadoObtenido = Aparcamiento.gestionarAcceso("coche", 0, 0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void CP5() {
		String resultadoEsperado = "Número de horas no válido";
		String resultadoObtenido = Aparcamiento.gestionarAcceso("moto", 0, 0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void CP6() {
		String resultadoEsperado = "Error en el número de plazas disponibles";
		String resultadoObtenido = Aparcamiento.gestionarAcceso("coche", 1, -1);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}