
public class ContaCorrente {
	int saldo;
	
	public void sacar(int valor) {
		saldo= saldo - valor;
	}
	
	public void depositar(int valor) {
		saldo = saldo + valor;
	}
}
	
