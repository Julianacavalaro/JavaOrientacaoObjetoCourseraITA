
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteContaEspecial  extends TesteContaCorrente{
	
	@BeforeEach
	public void inicializaContaEspecial(){
	contaCorrente = new ContaEspecial(100);
	contaCorrente.depositar(10);
	}
	
	@Test
	public void sacarLimite() {
	int valorSaque = contaCorrente.sacar(100);
	System.out.println("sacarLimite()"+ contaCorrente.saldo);
	assertEquals(contaCorrente.saldo, -90);
	assertEquals(valorSaque, 100);
	}

	@Test
	public void sacarSemLimite() {
	int valorSaque = contaCorrente.sacar(200);
	System.out.println("sacarSemLimite()"+ contaCorrente.saldo);
	assertEquals(contaCorrente.saldo, 10);
	assertEquals(valorSaque, 0);
	}
}
