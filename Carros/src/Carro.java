
public class Carro {

		int potencia; // Atributos da classe Carro
		float velocidade;
		String nome;
		
		//Construtor [mesmo nome da classe][Nao defini retorno]
		public Carro(int potencia) {
			//super();
			this.potencia = potencia;
			velocidade =0;
		}

		public Carro(float velocidade) {
			this.velocidade = velocidade;
		}
		void acelerar() {
			velocidade = velocidade + potencia;
		}
		
		void frear() {
			velocidade = velocidade / 2;
		}
		
		float getVelocidade() {
			return velocidade;
		}
		
		void imprimir() {
			System.out.println("O carro " +nome+ " está a velocidade de "+getVelocidade()+" por km/h");
		}
}
