import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarro {
	
	@Test
	void testImprimir() {
		Carro c = new Carro();
		String nome = "carro do José";
		c.potencia = 5;
		c.acelerar();
		c.imprimir();
		assertEquals("carro do José", nome);
		
	}

	@Test
	void testCarroAcelerando() {
		Carro c = new Carro(15);
		assertEquals(15, c.getVelocidade());
	}
	
	@Test
	void testCarroParado() {
		Carro c = new Carro();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	void testAcelerar() {
		Carro c = new Carro(); 
		c.potencia(10);
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	void TestFrear() {
		Carro c = new Carro();
		c.potencia(10);
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	@Test
	void TestFrearAteZero() {
		Carro c = new Carro();
		c.potencia(10);
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}

}
