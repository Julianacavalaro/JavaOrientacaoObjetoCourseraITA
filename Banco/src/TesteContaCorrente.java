import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteContaCorrente {

	@Test
	void depositar() {
		ContaCorrente contaComDeposito = new ContaCorrente();
		contaComDeposito.depositar(10);
		assertEquals(contaComDeposito.saldo, 10);

	}
	
	@Test
	void sacarComSaldo() {
		ContaCorrente contaComSaldo = new ContaCorrente();
		contaComSaldo.depositar(10);
		//contaComSaldo.sacar(5);
		int valorSaque = contaComSaldo.sacar(6);
		assertEquals(contaComSaldo.saldo, 4);
		assertEquals(valorSaque , 6);

	}
	
	@Test
	void sacarSemSaldo() {
		ContaCorrente contaComSaldo = new ContaCorrente();
		contaComSaldo.depositar(10);
		contaComSaldo.sacar(15);
		assertEquals(contaComSaldo.saldo, 10);
		assertEquals(contaComSaldo.sacar(15), 0);

	}


}
