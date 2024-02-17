import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
		
	}
	@Test
	void compraParcelada() {
		Compra c = new Compra(250, 2);
		assertEquals(2, c.getNumeroParcelas());
		assertEquals(500, c.getValorTotal());
		assertEquals(250, c.getValorParcela());
	}

}
