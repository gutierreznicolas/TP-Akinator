package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Modelo.PaisesDelJuego;

class testAkinator {
	@Test
	void CantidadDePaisesTest() {
		PaisesDelJuego paises= paisesPrueba();
		assertEquals(48,paises.CantPaises(paises));
	}
	@Test
	void EliminarPorContinenteTest() {
		PaisesDelJuego paises= paisesPrueba();
		paises.eliminarPorContinente("Sur America");
		assertEquals(10,paises.CantPaises(paises));
	}
	@Test
	void EliminarPorCaracteristicaTest() {
		PaisesDelJuego paises= paisesPrueba();
		paises.eliminarPorCarac("messi");
		assertEquals(1,paises.CantPaises(paises));
	}
	@Test
	void EliminarSiCumpleLaCaracteristicaTest() {
		PaisesDelJuego paises= paisesPrueba();
		paises.eliminarSiCumpleLaCaracteristica("messi");
		assertEquals(47,paises.CantPaises(paises));
	}
	@Test
	void darPaisTest() {
		PaisesDelJuego paises= paisesPrueba();
		paises.eliminarPorCarac("messi");
		assertEquals("Argentina",paises.darPais());
	}
	private PaisesDelJuego paisesPrueba() {
		PaisesDelJuego paises =new PaisesDelJuego();
		return paises;
	}

}
