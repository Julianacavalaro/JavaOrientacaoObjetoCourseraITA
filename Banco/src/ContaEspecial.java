
public class ContaEspecial extends ContaCorrente{
	int limite;

	//construtor da classe
	public ContaEspecial(int limite) {
		this.limite = limite;
	}
	
	public int sacar(int valor) {
		if(valor > (limite + saldo)) {
			return 0;
		}else {
			saldo = saldo - valor;
			return valor;
		}
		

	}

	

}
