
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();
		carro.potencia = 10;
		carro.nome = "Corcel";
		carro.velocidade = 15;
		
		Carro carro2 = new Carro();
		carro2.potencia = 10;
		carro2.nome = "Carango";
		carro2.velocidade = 15;
		
		Carro carro3 = new Carro();
		carro3.potencia = 10;
		carro3.nome = "Corcel";
		carro3.velocidade = 0;
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		//carro.frear();
		carro.imprimir();
		
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		
		System.out.println("Imprimindo carro3");
		carro3.imprimir();

	}

}
