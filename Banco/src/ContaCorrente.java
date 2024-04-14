
public class ContaCorrente {
	int saldo;
	
	public int sacar(int valorSaque) {
		if(valorSaque > saldo) {
			return 0;
		}else
			saldo = saldo - valorSaque;
		return valorSaque;

	}
	
	public void depositar(int valor) {
		saldo = saldo + valor;
	}
}
	
